package kuit.hackathon.starbucks.repository.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public class MenuDetailDto {

    private MenuDetail menuDetail;

    public MenuDetailDto (Long id, String name_kr, String name_eng, String image_url, String info){
        menuDetail = new MenuDetail(
                id, name_kr, name_eng, image_url, info
        );
    }

    @Getter
    @AllArgsConstructor
    class MenuDetail{
        private Long id;
        private String name_kr;
        private String name_eng;
        private String image_url;
        private String info;
    }
}
