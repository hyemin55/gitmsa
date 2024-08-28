package org.example;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        names.stream()  // 스트림 생성
//                .filter(name -> name.startsWith("A"))  // "A"로 시작하는 이름만 남김
                .map(name -> name.toUpperCase())  // 이름을 대문자로 변환
                .forEach(System.out::println);
    }
}