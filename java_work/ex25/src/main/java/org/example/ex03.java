package org.example;

import java.util.Comparator;
import java.util.TreeSet;

public class ex03 {
    public static void main(String[] args) {
        Comparator<Person> comparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        };
//        람다 사용. java가 발전하여 위의 오버라이드를 아래처럼 한줄로 작성가능하다.
//        TreeSet<Person> treeSet = new TreeSet<>((o1,o2)->o2.getAge()-o1.getAge());

        TreeSet<Person> treeSet = new TreeSet<>(comparator);
        treeSet.add(new Person(10,"홍길동"));
        treeSet.add(new Person(15,"이길동"));
        treeSet.add(new Person(20,"김길동"));

        System.out.println(treeSet);
    }
}
