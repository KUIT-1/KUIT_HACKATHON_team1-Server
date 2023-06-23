package kuit.hackathon.starbucks.controller;

import kuit.hackathon.starbucks.domain.entity.Option;
import kuit.hackathon.starbucks.domain.entity.menu.Drink;
import kuit.hackathon.starbucks.repository.DTO.RecommandMenuDTO;
import kuit.hackathon.starbucks.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/menu")
public class OptionController {
    //음료메뉴별 옵션 조회, 선택
//    @GetMapping("/drink")
//    public HttpEntity<RecommandMenuDTO> drinkOption(Drink drink){
//        log.info("OptionController.drinkOption");
//        Option option = drink.getOption();
//        HttpEntity< MultiValueMap<String, String>> dtoHttpEntity = new HttpEntity<>(RecommandMenuDTO.getName(), RecommandMenuDTO.getImageUrl());
//
//        return dtoHttpEntity;
//    }
}
