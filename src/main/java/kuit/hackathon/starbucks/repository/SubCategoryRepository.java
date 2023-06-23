package kuit.hackathon.starbucks.repository;

import kuit.hackathon.starbucks.domain.entity.category.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {
    
    @Query(value = "select s from SubCategory s where s.mainCategory.id =:id")
    List<SubCategory> getAllByMainCategoryId(@Param("id") Long id);
}
