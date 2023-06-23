package kuit.hackathon.starbucks.domain.entity.category;


import jakarta.persistence.*;
import kuit.hackathon.starbucks.domain.others.Name;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

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

//    @ManyToOne
//    @JoinColumn(name = "main_category_id")
//    private MainCategory mainCategory;

}
