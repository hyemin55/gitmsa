package org.example;

import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {

        String[] arr = {"YOON","PARK","ROBOT"};

        Arrays.stream(arr).forEach(s-> System.out.println("내용 "+s));
    }
}
