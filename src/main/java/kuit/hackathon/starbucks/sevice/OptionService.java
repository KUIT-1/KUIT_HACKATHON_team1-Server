package kuit.hackathon.starbucks.sevice;

import kuit.hackathon.starbucks.repository.DTO.DrinkOption;
import kuit.hackathon.starbucks.repository.DTO.FoodOption;
import kuit.hackathon.starbucks.repository.OptionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OptionService {

    private final OptionRepository optionRepository;

    public DrinkOption getOptions_drink(String menuId) {

        DrinkOption options = optionRepository.getOptions_drink(menuId);
        return options;

    }

    public FoodOption getOptions_food(String menuId) {

        FoodOption options = optionRepository.getOptions_food(menuId);
        return options;

    }

}
