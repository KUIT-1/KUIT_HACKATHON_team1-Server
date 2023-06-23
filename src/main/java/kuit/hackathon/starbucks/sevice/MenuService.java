package kuit.hackathon.starbucks.sevice;

import kuit.hackathon.starbucks.domain.entity.menu.Menu;
import kuit.hackathon.starbucks.repository.DTO.RecommandMenuDTO;
import kuit.hackathon.starbucks.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class MenuService {
    private final MenuRepository menuRepository;

    public List<RecommandMenuDTO> find() {
        List<Menu> menuList = menuRepository.findRecommendMenuByDtype("FOOD");
        List<RecommandMenuDTO> menuDTOS = menuList.stream()
                .map(menu ->
                        new RecommandMenuDTO(menu.getName().getNameKr(), menu.getImageUrl()))
                .collect(Collectors.toList());

        return menuDTOS;
    }
}
