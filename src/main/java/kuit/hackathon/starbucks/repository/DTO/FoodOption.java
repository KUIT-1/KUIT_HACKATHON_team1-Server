package kuit.hackathon.starbucks.repository.DTO;

import lombok.Getter;

@Getter
public class FoodOption extends OptionDto {
    private Long optionId;
    private boolean is_heated;

    public FoodOption(Long optionId, boolean is_heated) {

        this.optionId = optionId;
        this.is_heated = is_heated;
    }
}
