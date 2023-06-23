package kuit.hackathon.starbucks.repository.DTO;

import kuit.hackathon.starbucks.domain.entity.category.SubCategory;
import kuit.hackathon.starbucks.domain.entity.menu.Menu;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigInteger;

@Getter
@AllArgsConstructor
public class MenusResponseDto {
    private final Long id;
    private final String name_kr;
    private final String name_eng;
    private final String image_url;
    private final Long price;

    public MenusResponseDto(Menu menu){
        this.id= menu.getId();
        this.name_kr=menu.getName().getNameKr();
        this.name_eng=menu.getName().getNameEng();
        this.image_url=menu.getImageUrl();
        this.price=menu.getPrice();
    }
}
