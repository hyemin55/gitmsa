package com.pmh.test02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test02Application {

	public static void main(String[] args) {
		SpringApplication.run(Test02Application.class, args);
	}

//        구동순서 = UserController -> UserService -> UserRepository

}
