package kuit.hackathon.starbucks.repository;

import kuit.hackathon.starbucks.domain.entity.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu, Long> {

    @Query(value = "select * from Menu where dtype = :dtype", nativeQuery = true)
    List<Menu> findRecommendMenuByDtype(@Param("dtype") String dType);

    @Query(value = "SELECT m FROM Menu m WHERE m.name.nameKr LIKE %:name% or m.name.nameEng LIKE %:name%")
    List<Menu> searchByName(@Param("name") String name);
}

