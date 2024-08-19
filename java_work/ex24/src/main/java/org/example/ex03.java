package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ex03 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Toy","Box","ROBOT");

        list = new ArrayList<>(list);
        list.add("위에꺼 없으면 안된당.");

        System.out.println(list);
    }
}
