package kuit.hackathon.starbucks.domain.menu;

import jakarta.persistence.*;
import kuit.hackathon.starbucks.domain.BaseEntity;
import kuit.hackathon.starbucks.domain.Name;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Menu extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "menu_id")
    private Long id;

    @Embedded
    private Name name;

    private Long price;

    private String info;

    @Column(name = "image_url")
    private String imageUrl;

}
