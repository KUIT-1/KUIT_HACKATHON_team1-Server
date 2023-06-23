package kuit.hackathon.starbucks.repository.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class RecommendDtos {
    List<RecommandMenuDTO> recommendMenuDtos = new ArrayList<>();
}
