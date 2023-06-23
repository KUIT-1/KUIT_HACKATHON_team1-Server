package kuit.hackathon.starbucks.repository;

import kuit.hackathon.starbucks.domain.entity.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OptionJpaRepository extends JpaRepository<Option, Long> {

//    @Query("select o from Option o where o.menu.id = :menuId ")
    Option findByMenuId(@Param("menuId") Long menuId);
}
