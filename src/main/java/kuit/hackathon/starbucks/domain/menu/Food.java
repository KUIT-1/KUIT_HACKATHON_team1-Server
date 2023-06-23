package kuit.hackathon.starbucks.domain.menu;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorValue(value = "F")
@PrimaryKeyJoinColumn
@Table(name = "food_menu")
public class Food extends Menu {

    @Lob
    @Column(name = "product_nutrition")
    private String productNutrition;

    @Lob
    @Column(name = "product_info")
    private String productInfo;

}
