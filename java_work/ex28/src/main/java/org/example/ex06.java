package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ex06 {
    public static void main(String[] args) {

        Optional<String> optionalS1 = Optional.of("abCD efg");
        Optional<String> optionalS2 = optionalS1.map(s -> s.toUpperCase());

        System.out.println(optionalS2);
        System.out.println(optionalS2.get());

//        replace는 지정한 문자를 다른 문자로 변경할때.
        Optional<String> optionalS3 = optionalS1
                .map(s -> s.replace(" ", "-"))
                .map(s -> s.toLowerCase());
        System.out.println(optionalS3);
        System.out.println(optionalS3.get());

//        orElse는 내용물이 없으면 "EMPTY"를 출력하게한다.
        String result = optionalS1.map(string -> string.toUpperCase())
                .orElse("EMPTY");

        Optional<Integer> optionalS4 = optionalS1.map(s -> s.length());
        System.out.println(optionalS4);
        System.out.println(optionalS4.get());

        System.out.println();

        List<String> list = Arrays.asList("aaa", "BB", "C", "dddd");
        list.stream().map(string -> string.toUpperCase())
                .forEach(System.out::println);

        list.stream().map(string -> string.replace("aa", "AA바꿈"))
                .forEach(System.out::println);

        list.stream().map(string -> string.length())
                .forEach(System.out::println);
    }
}
