package kuit.hackathon.starbucks.repository;

import kuit.hackathon.starbucks.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

//    public User findById(Long id);
}
