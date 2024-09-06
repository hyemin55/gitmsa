package com.pmh.ex03.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/*
@Configuration -> 객체 담는 통 정의
@Bean -> 객체 지정
@Component -> 객체 지정
@ComponentScan -> 패키니 내용 읽어서 객체 주입
@Autowired -> new 예약어 안쓰고 객체 자동 할당
private final -> @RequiredArgsConstructor -> 객체 자동할당
@Entity -> 테이블 지정
@Table(name = "users") -> table 이름 바꾸기
@ID -> 기본키 설정 primary키
 */


@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;

    private String name;
    private int age;
    private String email;
    private String password;
    private LocalDateTime wdate;
}
