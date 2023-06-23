package kuit.hackathon.starbucks.controller;

import kuit.hackathon.starbucks.repository.DTO.Menu;
import kuit.hackathon.starbucks.repository.DTO.RecommandMenuDTO;
import kuit.hackathon.starbucks.repository.DTO.RecommendDtos;
import kuit.hackathon.starbucks.sevice.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class MenuController
{

    private final MenuService menuService;

    @GetMapping("/menu/recommend")
    public ResponseEntity<RecommendDtos> findRecommned(){
        log.info("jjj");
        List<RecommandMenuDTO> list = menuService.find();
        RecommendDtos recommendDtos = new RecommendDtos(list);
        return new ResponseEntity<>(recommendDtos, HttpStatusCode.valueOf(200));
    }
}
