package kuit.hackathon.starbucks.controller;

import kuit.hackathon.starbucks.repository.DTO.*;
import kuit.hackathon.starbucks.sevice.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/menu")
@RequiredArgsConstructor
public class MenuController {
    private final MenuService menuService;


    @GetMapping("/recommend")
    public ResponseEntity<RecommendDtos> findRecommned() {
        log.info("jjj");
        List<RecommandMenuDTO> list = menuService.find();
        RecommendDtos recommendDtos = new RecommendDtos(list);
        return new ResponseEntity<>(recommendDtos, HttpStatusCode.valueOf(200));
    }

    @GetMapping("/mainCategory")
    public HttpEntity<ListDto> getCategories(@RequestParam Long id) {
        List<SubCategoryResponseDto> categories = menuService.getCategories(id);
        return new ResponseEntity<>(new ListDto(categories), HttpStatusCode.valueOf(200));
        //return id;
    }

    @GetMapping
    public HttpEntity<MenuListDto> searchByName(@PathVariable String name) {
        List<MenusResponseDto> menus = menuService.search(name);
        return new ResponseEntity<>(new MenuListDto(menus), HttpStatusCode.valueOf(200));
    }

    @GetMapping("/subCategory")
    public HttpEntity<MenuListDto> getMenus(@RequestParam Long id) {
        List<MenusResponseDto> menus = menuService.getMenus(id);
        return new ResponseEntity<>(new MenuListDto(menus),HttpStatusCode.valueOf(200));
    }
}
