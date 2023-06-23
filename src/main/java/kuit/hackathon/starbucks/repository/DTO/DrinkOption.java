package kuit.hackathon.starbucks.repository.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
public class DrinkOption {
    private int optionId;
    private String size;
    private String cup;
    private int shot;
    private int syrup;
    private String base;
    private String ice;
    private String cream;

    public DrinkOption(int optionId, String size, String cup, int shot, int syrup, String base, String ice, String cream) {
        this.optionId = optionId;
        this.size = size;
        this.cup = cup;
        this.shot = shot;
        this.syrup = syrup;
        this.base = base;
        this.ice = ice;
        this.cream = cream;
    }
}
