package org.example;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ex01 {
    public static void main(String[] args) {


        Box<Apple> box1 = new Box();
        Box<Orange> box2= new Box();

        Box<String> box3 = new Box();

        Box<Scanner> box4 = new Box<>();
        Box<StringTokenizer> box5 = new Box<>();
        Box<Random> box6 = new Box<>();

        box1.setObj(new Apple());
        box2.setObj(new Orange());

        box3.setObj("apple");

//       제네릭 문법.
//        public class Box<T>를 넣음으로써 형변환이 필요없다.
//        Apple apple = (Apple) box1.getObj();
//        Orange orange = (Orange) box2.getObj();
        Apple apple =box1.getObj();
        Orange orange = box2.getObj();


//        여러줄 출력할 때 """ 내용 """ 입력하면 된다.
        String a = """
                여러줄 %d
                나오기. %d
                """.formatted(10,20);
        System.out.println(a);
    }
}