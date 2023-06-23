package kuit.hackathon.starbucks.domain.entity.menu;

import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter
@DiscriminatorValue(value = "D")
@PrimaryKeyJoinColumn
@Table(name = "drink_menu")
public class Drink extends Food {

    @Column(name = "allergy", length = 100)
    private String allergy;

}
