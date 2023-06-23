package kuit.hackathon.starbucks.controller;

import kuit.hackathon.starbucks.repository.DTO.DrinkOption;
import kuit.hackathon.starbucks.repository.DTO.FoodOption;
import kuit.hackathon.starbucks.sevice.OptionService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/menus")
public class OptionController {

    private final OptionService optionService;

    @GetMapping("/drink/{menuId}/options")
    public HttpEntity<DrinkOption> getOptions_drink(@PathVariable String menuId){
        log.info("OptionController.drinkOption");

        DrinkOption drinkOption = optionService.getOptions_drink(menuId);

        ResponseEntity< DrinkOption > responseEntity = new ResponseEntity<>(HttpStatusCode.valueOf(300));
        return responseEntity;
    }

    @GetMapping("/food/{menuId}/options")
    public HttpEntity<FoodOption> getOptions_food(@PathVariable String menuId){
        log.info("OptionController.foodOption");

        FoodOption foodOption = optionService.getOptions_food(menuId);

        ResponseEntity< FoodOption > responseEntity = new ResponseEntity<>(HttpStatusCode.valueOf(300));
        return responseEntity;
    }

}
