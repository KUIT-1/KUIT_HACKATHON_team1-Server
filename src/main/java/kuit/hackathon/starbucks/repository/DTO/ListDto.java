package kuit.hackathon.starbucks.repository.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class ListDto {

    List<SubCategoryResponseDto> subCategoryList = new ArrayList<>();

}
