package com.example.ex09.user;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import java.time.LocalDateTime;

@Data

// 이곳은 프론트에 오는 파라메타의 검사할 조건을 적어준다.
public class UserReqDto {

    private Long idx;

    @Length(min = 2, max = 50)
    private String name;
    private int age;

    @NotEmpty //build에 jar파일을 잘 넣었을때 나온다.
    private String email;
    @NotEmpty
    private String password;

    private LocalDateTime wdate;
}
