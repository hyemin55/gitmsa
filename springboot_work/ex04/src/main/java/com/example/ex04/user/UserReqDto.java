package com.example.ex04.user;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import java.time.LocalDateTime;

@Data

// 이곳은 프론트에 오는 파라메타의 검사할 조건을 적어준다.
public class UserReqDto {

    private Long idx;

    private String name;
    private int age;

    @NotEmpty //build에 jar파일을 잘 넣었을때 나온다.
    private String email;
    @NotEmpty
    private String password;

    private LocalDateTime wdate;
}
