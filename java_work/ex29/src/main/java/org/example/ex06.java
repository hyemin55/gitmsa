package org.example;

import java.util.Optional;
import java.util.stream.Stream;

public class ex06 {
    public static void main(String[] args) {

//        peek은 중간연산이고 forEach가 최종연산이다.
//        최종연산이 없으면 중간연산은 출력되지 않는다.
        Stream.of(1,2,3,4,5,6,7)
                .peek(System.out::println)
                .sorted((o1, o2) -> o2-o1)
//                .peek(System.out::println)
                .forEach(System.out::println);

        int count = (int) Stream.of(10,20,5,9,8,2).count();
        System.out.println("count = "+count);

        int max = Stream.of(10,20,5,8,9)
                .mapToInt(value -> Integer.valueOf(value))
                .max()
                .orElse(0);

        System.out.println("max = "+max);
    }
}
