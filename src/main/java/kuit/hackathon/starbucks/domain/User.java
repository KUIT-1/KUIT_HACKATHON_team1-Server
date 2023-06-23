package kuit.hackathon.starbucks.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "users")
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String loginId;
    private String password;
    private String phoneNumber;

    @Enumerated(value = EnumType.STRING)
    private Status status;
    @Enumerated(value = EnumType.STRING)
    private Level grade;

//    public static User createUser(String name, String loginId, String password) {
//        User user = new User();
//        user.name = name;
//        user.loginId = loginId;
//        user.password = password;
//
//        return user;
//    }

}
