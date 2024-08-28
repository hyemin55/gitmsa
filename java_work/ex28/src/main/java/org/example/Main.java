package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
//  {1,3,5,7,9} -> {9,7,5,3,1} 바꿔 출력하기.
        List<Integer> list = Arrays.asList(1,3,5,7,9);
        List<Integer> list2 = Arrays.asList(1,2,5,7,9);
        list = new ArrayList<>(list);

        System.out.println(list);

//        reverse는 static함수이다.
        Consumer<List<Integer>> consumer = mylist -> Collections.reverse(mylist);
        consumer.accept(list);
        System.out.println(list);
        consumer.accept(list);
        consumer.accept(list2);


        System.out.println(list);
        System.out.println(list2);


    }
}