package org.example;

import java.util.stream.Stream;

public class ex07 {
    public static void main(String[] args) {
        boolean b = Stream.of(1,2,3,4,5,6)
                .allMatch(integer -> integer%2==0);
        System.out.println("모두 짝수인가? = "+b);

        boolean c = Stream.of(1,2,3,4,5,6)
                .noneMatch(s -> s%2==0);
        System.out.println("모두 짝수가 아닌가? = "+c);

        boolean d = Stream.of(1,2,3,4,5,6)
                .noneMatch(s -> s%2==0);
        System.out.println("모두 짝수가 아닌가? = "+d);

    }
}
