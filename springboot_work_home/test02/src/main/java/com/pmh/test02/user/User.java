package com.pmh.test02.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

/* 기본 개발패턴
entity -> 테이블 정의
controller -> URL맵핑
repository -> Database 연결(insert, select)
RequsetDto -> 유효성 검사
service -> 기능을 묶는다.
 */

// DB 테이블의 컬럼조건을 적어준다.

@Getter
@Setter
@ToString
@Entity //DB와 1:1 매핑관계에 해당되고 JPA의 속성때문에 개발패턴을 User와 UserReqDto로 따로 만들어준다.
@Builder
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // <- AutoIncrement 실행하기
    private Long idx;


    private String name;
    private int age;

    @Column(length = 100, unique = true)
    private String email;

    @Column(length = 100)
    private String password;
    private LocalDateTime wdate;
}
