package com.pmh.test02.user;


import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

import java.time.LocalDateTime;

// 프론트에서 오는 파라메타 검사할 때 사용한다.
@Data
public class UserReqDto {

    private Long idx;


    private String name;
    private int age;

    @NotEmpty
    private String email;

    @NotEmpty
    private String password;

    private LocalDateTime wdate;

}
