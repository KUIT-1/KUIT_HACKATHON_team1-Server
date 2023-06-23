package kuit.hackathon.starbucks.repository.DTO;

import kuit.hackathon.starbucks.domain.entity.category.MainCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MainCategoryResponseDto {
    private final Long id;
    private final String mainCategory;

    public MainCategoryResponseDto(MainCategory mainCategory) {
        this.id = mainCategory.getId();
        this.mainCategory = mainCategory.getMainCategory();
    }
}
