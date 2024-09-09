package com.example.ex04;

import com.example.ex04.obj.AA;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ex04Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex04Application.class, args);
	}

	@Bean
	public AA aa(){
		return new AA();
	}
}

