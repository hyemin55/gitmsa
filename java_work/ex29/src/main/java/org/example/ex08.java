package org.example;

import java.util.*;
import java.util.stream.Stream;

public class ex08 {
    public static void main(String[] args) {

//        홀수만 출력하기
        List<Integer> oddlist = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(integer -> integer % 2 == 1)
                .collect(() -> new ArrayList<Integer>()
                        , (list, item) -> list.add(item)
                        , ((integers, integers2) -> {
                        }));
        System.out.println(oddlist);

        //        짝수만 출력하기
        List<Integer> evenlist = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(integer -> integer % 2 == 0)
                .collect(() -> new ArrayList<Integer>()
                        , (list, item) -> list.add(item)
                        , ((integers, integers2) -> {
                        }));
        System.out.println(evenlist);

//        중복제거하기
        Set<Integer> mset = Stream.of(10, 20, 30, 10, 80, 20)

                .collect(() -> new HashSet<Integer>()
                        , (set, item) -> set.add(item)
                        , (integers, integers2) -> {
                        });

//        제거한 값을 내림차순으로
        List<Integer> to = mset.stream().sorted((o1, o2) -> o2 - o1)
                .collect(() -> new ArrayList<Integer>()
                        , (list, item) -> list.add(item)
                        , ((integers, integers2) -> {
                        }));
        System.out.println(to);

    }
}
