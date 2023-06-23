package kuit.hackathon.starbucks.domain.others;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Name {

    @Column(name = "name_kr", length = 20)
    private String nameKr;

    @Column(name = "name_eng", length = 30)
    private String nameEng;
}
