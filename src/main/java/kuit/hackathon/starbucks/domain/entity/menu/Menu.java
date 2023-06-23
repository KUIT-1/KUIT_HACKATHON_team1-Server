package kuit.hackathon.starbucks.domain.entity.menu;

import jakarta.persistence.*;
import kuit.hackathon.starbucks.domain.entity.Option;
import kuit.hackathon.starbucks.domain.entity.category.SubCategory;
import kuit.hackathon.starbucks.domain.others.BaseEntity;
import kuit.hackathon.starbucks.domain.others.Name;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "dtype")
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

    @Column(name = "dtype")
    private String dtype;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "option_id")
    private Option option;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategory;

}
