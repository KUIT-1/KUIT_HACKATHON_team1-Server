package kuit.hackathon.starbucks.repository.DTO;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class SearchResultResponseDto {

    private List<SearchDto> searchDtos = new ArrayList<>();

    public void addDto(Long menuId, String nameKr, String nameEng, String imageUrl, Long price) {
        searchDtos.add(new SearchDto(menuId, nameKr, nameEng, imageUrl, price));
    }

    @Getter
    @AllArgsConstructor
    class SearchDto {
        private Long menuId;
        private String nameKr;
        private String nameEng;
        private String imageUrl;
        private Long price;
    }

}
