package org.example;

import java.util.Arrays;
import java.util.stream.Stream;

public class ex04 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("MY_AGE","YOUR_LIFE");

        String [] strArr = {"MY_AGE","YOUR_LIFE"};
        for (String str : strArr){
            String temp [] = str.split(("_"));
            for (String s : temp)
            System.out.println(s);
        }

        System.out.println();

        stream.flatMap(s-> Arrays.stream(s.split("_")))
                .forEach(System.out::println);

        System.out.println();

//      다시 해보쟈!
        stream = Stream.of("MY_AGE","YOUR LIFE");
        stream.flatMap(s-> Arrays.stream(s.split("_"))).map(ss->ss.length())
                .forEach(System.out::println);

        System.out.println();

        stream = Stream.of("MY_AGE","YOUR LIFE");
        stream.flatMap(s->Stream.of(s.split("_")))
                .forEach(System.out::println);
    }
}
