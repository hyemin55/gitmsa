package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex04 {
    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5, 6)
                .filter(n -> n % 2 == 1)
                .forEach(s -> System.out.println("홀수 " + s));

        List<Member> list = Arrays.asList(
                new Member(1, "홍길동", 20, "aaa@naver.com", "12345"),
                new Member(2, "김길동", 25, "bbb@naver.com", "12345"),
                new Member(3, "박길동", 30, "ccc@naver.com", "12345")
        );
//        1. 나이에 최종합
//        2. 나이가 30이상인 사람 출력
        int result = 0;
        for (Member member : list) {
            result += member.getAge();
            System.out.println(member);
        }
        System.out.println("나이에 최종합 = " + result);

        result = list.stream()
                .mapToInt(s -> s.getAge())
                .sum();
        System.out.println("나이에 최종합 = " + result);

        list.stream()
                .filter(member -> member.getAge() >= 30)
                .mapToInt(s -> s.getAge())
                .forEach(age -> {
                    System.out.println("내용");
                    System.out.println(age);
                });
    }
}
