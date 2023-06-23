package kuit.hackathon.starbucks.sevice;

import kuit.hackathon.starbucks.domain.entity.Option;
import kuit.hackathon.starbucks.repository.DTO.DrinkOption;
import kuit.hackathon.starbucks.repository.DTO.FoodOption;
import kuit.hackathon.starbucks.repository.OptionJpaRepository;
import kuit.hackathon.starbucks.repository.OptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OptionService {

    private final OptionJpaRepository jpaRepository;
    private final OptionRepository optionRepository;

    public DrinkOption findOptionByMenuId(Long id) {
        Option option = jpaRepository.findByMenuId(id);
        if (option==null) throw new IllegalArgumentException("값이 없습니다.");

        DrinkOption drinkOption = new DrinkOption(
                option.getId(),
                option.getSize(),
                option.getCup(),
                option.getShot(),
                option.getSyrup(),
                option.getBase(),
                option.getIce(),
                option.getCream()
        );
        return drinkOption;
    }

    @Deprecated
    public DrinkOption getOptions_drink(Long menuId) {

        DrinkOption options = optionRepository.getOptions_drink(menuId);
        return options;

    }

    public FoodOption getOptions_food(Long menuId) {

        FoodOption options = optionRepository.getOptions_food(menuId);
        return options;

    }

}
