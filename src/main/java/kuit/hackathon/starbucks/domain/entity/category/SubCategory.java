package kuit.hackathon.starbucks.domain.entity.category;


import jakarta.persistence.*;
import kuit.hackathon.starbucks.domain.entity.menu.Menu;
import kuit.hackathon.starbucks.domain.others.Name;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sub_category_id")
    private Long id;

    @Embedded
    private Name name;
  
    @Column(name = "image_url")
    private String imageUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "main_category_id")
    private MainCategory mainCategory;

    @OneToMany(mappedBy = "subCategory")
    private List<Menu> menus = new ArrayList<>();

}
