package kuit.hackathon.starbucks.repository;

import kuit.hackathon.starbucks.domain.entity.Option;
import kuit.hackathon.starbucks.domain.entity.menu.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {

}
