package kuit.hackathon.starbucks.repository.DTO;

import kuit.hackathon.starbucks.domain.entity.category.SubCategory;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SubCategoryResponseDto {
    private final Long id;
    private final String name_kr;
    private final String name_eng;

    public SubCategoryResponseDto(SubCategory subCategory){
        this.id= subCategory.getId();
        this.name_kr=subCategory.getName().getNameKr();
        this.name_eng=subCategory.getName().getNameEng();
    }
}
