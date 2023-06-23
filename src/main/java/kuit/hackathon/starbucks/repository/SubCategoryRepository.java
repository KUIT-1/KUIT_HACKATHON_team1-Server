package kuit.hackathon.starbucks.repository;

import kuit.hackathon.starbucks.domain.entity.category.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubCategoryRepository extends JpaRepository<SubCategory, Long> {

}
