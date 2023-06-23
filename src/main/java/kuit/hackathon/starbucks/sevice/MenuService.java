package kuit.hackathon.starbucks.sevice;

import kuit.hackathon.starbucks.domain.entity.category.SubCategory;
import kuit.hackathon.starbucks.domain.entity.menu.Menu;
import kuit.hackathon.starbucks.repository.DTO.RecommandMenuDTO;
import kuit.hackathon.starbucks.repository.DTO.SearchResultResponseDto;
import kuit.hackathon.starbucks.repository.DTO.SubCategoryResponseDto;
import kuit.hackathon.starbucks.repository.MenuRepository;
import kuit.hackathon.starbucks.repository.SubCategoryRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MenuService {
    private final MenuRepository menuRepository;
    private final SubCategoryRepository subCategoryRepository;

    public List<RecommandMenuDTO> find() {
        List<Menu> menuList = menuRepository.findRecommendMenuByDtype("FOOD");
        List<RecommandMenuDTO> menuDTOS = menuList.stream()
                .map(menu ->
                        new RecommandMenuDTO(menu.getName().getNameKr(), menu.getImageUrl()))
                .collect(Collectors.toList());

        return menuDTOS;
    }

    public List<SubCategoryResponseDto> getCategories(Long id) {
        List<SubCategory> subCategories = subCategoryRepository.getAllByMainCategoryId(id);
        List<SubCategoryResponseDto> subCategoryResponseDtos = new ArrayList<>();
        for(SubCategory s: subCategories) {
            SubCategoryResponseDto subCategoryResponseDto = new SubCategoryResponseDto(s);
            subCategoryResponseDtos.add(subCategoryResponseDto);
            log.info("sub ~~ {} {} {} ", subCategoryResponseDto.getId(), subCategoryResponseDto.getName_kr(), subCategoryResponseDto.getName_eng());
        }
        return subCategoryResponseDtos;
    }

    public SearchResultResponseDto searchByName(String name) {
        List<Menu> menus = menuRepository.searchByName(name);

        SearchResultResponseDto searchResultResponseDto = new SearchResultResponseDto();

        menus.forEach(menu -> {
            searchResultResponseDto.addDto(
                    menu.getId(),
                    menu.getName().getNameKr(),
                    menu.getName().getNameEng(),
                    menu.getImageUrl(),
                    menu.getPrice());
        });

        return searchResultResponseDto;
    }
}
