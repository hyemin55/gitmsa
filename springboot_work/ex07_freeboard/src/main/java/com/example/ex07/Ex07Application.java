package com.example.ex07;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ex07Application {

    public static void main(String[] args) {

        System.out.println("ଘ(੭*ˊᵕˋ)੭»ㅡ❥");
        ApplicationContext applicationContext =
                SpringApplication.run(Ex07Application.class, args);

//        Arrays.stream(applicationContext.getBeanDefinitionNames())
//                .forEach(System.out::println);
    }

}

