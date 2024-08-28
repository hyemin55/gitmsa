package org.example;

import java.util.function.Function;

public class ex03 {
    public static void main(String[] args) {
//        아래 두가지방법으로 사용가능.
        Function<char[],String> function = String::new;
//        Function<char[],String> function = chars -> new String(chars);

        String test = function.apply(new char[]{'a','b','c','d'});
        System.out.println(test);
    }
}
