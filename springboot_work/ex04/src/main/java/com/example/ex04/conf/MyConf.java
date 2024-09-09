package com.example.ex04.conf;

import com.example.ex04.obj.AA;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //객채담는 통
@ComponentScan(basePackages = "com.pmh.ex04.obj")
public class MyConf {


}
