package kuit.hackathon.starbucks.domain.entity.menu;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
//@DiscriminatorValue(value = "F")
@PrimaryKeyJoinColumn
@Table(name = "food_menu")
public class Food extends Menu {

    @Column(name = "production_nutrition", length = 500)
    private String productNutrition;

    @Column(name = "production_info", length = 100)
    private String productInfo;

}
