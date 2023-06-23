package kuit.hackathon.starbucks.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
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

    @Column(name = "price")
    private Long price;

    @Column(name = "info")
    private String info;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "dtype", length = 10)
    private String dType;

}
