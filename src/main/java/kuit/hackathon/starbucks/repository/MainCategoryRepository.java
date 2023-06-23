package kuit.hackathon.starbucks.repository;

import kuit.hackathon.starbucks.domain.entity.category.MainCategory;
import kuit.hackathon.starbucks.domain.entity.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MainCategoryRepository extends JpaRepository<MainCategory, Long> {

}
