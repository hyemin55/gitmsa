package org.example;

import java.util.HashSet;
import java.util.Set;

public class ex01 {
    public static void main(String[] args) {
//        Set<>에  값을 넣으면 중복값을 출력하지 않는다.
        Set<String> set = new HashSet<>();
        set.add("BOX");
        set.add("TOY");
        set.add("BOX");
        set.add("ROBOT");

        System.out.println(set);

//        set.add(new String("BOXX"));
//        System.out.println(set);

        System.out.println("BOX".hashCode());
        System.out.println(new String("BOX").hashCode());

        Set<Member> set1 = new HashSet<>();
        set1.add(new Member());
        set1.add(new Member());

        System.out.println(new Member().hashCode());
        System.out.println(new Member().hashCode());
        System.out.println(new Member().hashCode());
    }
}
