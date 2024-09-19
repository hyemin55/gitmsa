package com.pmh.test02.user;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

// 테이블 조건을 적어준다.

@Getter
@Setter
@ToString
@Entity
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
