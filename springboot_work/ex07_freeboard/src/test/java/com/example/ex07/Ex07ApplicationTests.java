package com.example.ex07;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

//@SpringBootTest
class Ex07ApplicationTests {

	@Autowired

	@Test
	void contextLoads() {

		String []str = {"10입니다","20입니다","30입니다"};
		Arrays.stream(str).forEach(System.out::println);

		String result = Arrays.stream(str).reduce("",((string, string2) -> {return string+string2;}));
		System.out.println("result ="+result);
		Arrays.stream(str).reduce("",((string, string2) -> string+string2));
	}

}
