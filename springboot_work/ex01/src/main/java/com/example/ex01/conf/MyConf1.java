package com.example.ex01.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//스프링 객체 담는 통 생성
@Configuration
//원하는 디렉토리를 읽고 객체 주입 해준다.
@ComponentScan(basePackages = "com.exampl.ex01.member")
public class MyConf1 {

}
