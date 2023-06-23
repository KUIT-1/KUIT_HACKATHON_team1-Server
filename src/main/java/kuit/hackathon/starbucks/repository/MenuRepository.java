package kuit.hackathon.starbucks.repository;

import kuit.hackathon.starbucks.domain.entity.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query(value = "select m from Menu m where m.dtype = :dtype")
    List<Menu> findRecommendMenuByDtype(@Param("dtype") String dType);
}

