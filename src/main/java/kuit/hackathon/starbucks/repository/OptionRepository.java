package kuit.hackathon.starbucks.repository;

import kuit.hackathon.starbucks.repository.DTO.DrinkOption;
import kuit.hackathon.starbucks.repository.DTO.FoodOption;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.Map;

@Repository
public class OptionRepository {

    private final NamedParameterJdbcTemplate jdbcTemplate;

    public OptionRepository(DataSource dataSource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }


    public DrinkOption getOptions_drink(String menuId) {

        String sql = "select menu.menu_id,\n" +
                "       o.option_id,\n" +
                "       size,\n" +
                "       cup,\n" +
                "       shot,\n" +
                "       syrup,\n" +
                "       base,\n" +
                "       ice,\n" +
                "       cream\n" +
                "from menu\n" +
                "         inner join `option` o on menu.option_id = o.option_id\n" +
                "where menu.menu_id = :menuId";

        Map<String, Object> param = Map.of(
                "menuId", menuId);

        return jdbcTemplate.queryForObject(sql, param,
                (rs, rowNum) -> new DrinkOption(
                        rs.getInt("option_id"),
                        rs.getString("size"),
                        rs.getString("cup"),
                        rs.getInt("shot"),
                        rs.getInt("syrup"),
                        rs.getString("base"),
                        rs.getString("ice"),
                        rs.getString("cream")
                )
        );

    }

    public FoodOption getOptions_food(String menuId) {
        String sql = "select menu.menu_id,\n" +
                "       o.option_id,\n" +
                "       o.is_heated\n" +
                "from menu\n" +
                "         inner join `option` o on menu.option_id = o.option_id\n" +
                "where menu.menu_id = :menuId";

        Map<String, Object> param = Map.of(
                "menuId", menuId);

        return jdbcTemplate.queryForObject(sql, param,
                (rs, rowNum) -> new FoodOption(
                        rs.getInt("optionId"),
                        rs.getBoolean("is_heated")
                )
        );
    }

}
