package kuit.hackathon.starbucks.domain.entity;

import jakarta.persistence.*;
import kuit.hackathon.starbucks.domain.entity.menu.Menu;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "option_id")
    private Long id;

    @Column(name = "size", length = 20)
    private String size;

    @Column(name = "cup", length = 30)
    private String cup;

    @Column(name = "base", length = 30)
    private String base;

    @Column(name = "ice", length = 10)
    private String ice;

    @Column(name = "cream", length = 20)
    private String cream;

    private String isHeated;

    private Integer shot;

    private Integer syrup;

    @OneToOne(mappedBy = "option")
    private Menu menu;


}
