package kuit.hackathon.starbucks.domain.menu;

import jakarta.persistence.*;
import kuit.hackathon.starbucks.domain.BaseEntity;
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

    @Column(name = "name_kr", length = 20)
    private String nameKr;

    @Column(name = "name_eng", length = 30)
    private String nameEng;

    private Long price;

    private String info;

    @Column(name = "image_url")
    private String imageUrl;

}
