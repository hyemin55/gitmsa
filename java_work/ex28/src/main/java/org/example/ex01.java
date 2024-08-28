package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

class JustSort{
    public void sort(List<?> list){
        System.out.println(list);
        Collections.reverse(list);
    }
}
public class ex01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,3,8,7,9);
        list = new ArrayList<>(list);

        JustSort js = new JustSort();

//        아래 두가지로 표현가능.
//        Consumer<List<Integer>> consumer = jss->Collections.sort(jss);
        Consumer<List<Integer>> consumer = js::sort;
        consumer.accept(list);

        System.out.println(list);
    }
}
