package org.example;

import java.util.Arrays;
import java.util.List;

public class ex05 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AA", "CCCC", "BB", "DDD");

        String result = list.stream().reduce("AAAAA", (a, b) -> {
            if (a.length() > b.length()) return a;
            else return b;
        });

        /*
        1. 생성
        2. 중간연산
        map(수정), filter(선택추출), sorted(정렬)
        3. sum, foreach, reduce
         */
//  .sorted()는 정렬
        result = list.stream().sorted().reduce("",(a,b)->a+b);
        System.out.println(result);
    }
}
