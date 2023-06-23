package kuit.hackathon.starbucks.sevice;

import kuit.hackathon.starbucks.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository repository;
//
//    @Transactional
//    public User createUser(User user) {
//        User save = repository.save(user);
//        return save;
//    }

}
