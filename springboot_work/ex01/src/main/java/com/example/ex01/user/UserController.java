package com.example.ex01.user;

import com.example.ex01.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequiredArgsConstructor
public class UserController {

//    @getBean 대신 스프링 객체 담는 통에서 자동으로 가져오는 방법
//    @Autowired
//    MemberRepository memberRepository;

//    @RequiredArgsConstructor를 사용하는 방법
//    위 Autowired와 같은 방법이다.
    private final MemberRepository memberRepository;

    @GetMapping("hahah")
    public String aa(@RequestParam(name="name", defaultValue = "내이름") String name,
                     @RequestParam(name="age", defaultValue = "나이") Integer age){

        MemberRepository memberRepository = new MemberRepository();
        memberRepository.insert(name, age);


        return "저장했습니다.";
    }
}