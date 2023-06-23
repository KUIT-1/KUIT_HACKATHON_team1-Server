package kuit.hackathon.starbucks.repository.DTO;

import lombok.Getter;

@Getter
public class FoodOption {
    private boolean is_heated;

    public FoodOption(int optionId, boolean is_heated) {
        this.is_heated = is_heated;
    }
}
