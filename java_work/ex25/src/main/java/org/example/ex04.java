package org.example;

import java.util.Comparator;
import java.util.TreeSet;

public class ex04 {
    public static void main(String[] args) {

//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o2.length() - o1.length();
//            }
//        };
//
//        TreeSet<String> treeSet = new TreeSet<>(comparator);

//        람다로 출력할때.
        TreeSet<String> treeSet = new TreeSet<>((o1, o2)->o2.length()-o1.length());

        treeSet.add("A");
        treeSet.add("CCCCC");
        treeSet.add("DDDD");
        treeSet.add("BB");

        System.out.println(treeSet);
    }
}
