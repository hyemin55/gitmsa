package com.example.ex01.user;

import com.example.ex01.member.MemberRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;

@RestController
@CrossOrigin
public class UserController {

    @GetMapping("hahah")
    public String aa(@RequestParam(name="name", defaultValue = "내이름") String name,
                     @RequestParam(name="age", defaultValue = "나이") Integer age){

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insert(name, age);


        return "저장했습니다.";
    }
}