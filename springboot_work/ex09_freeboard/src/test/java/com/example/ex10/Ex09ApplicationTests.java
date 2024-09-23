package com.example.ex10;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

//@SpringBootTest
class Ex09ApplicationTests {

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
