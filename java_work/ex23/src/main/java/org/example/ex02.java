package org.example;

import java.util.Objects;

public class ex02 {
    public static void main(String[] args) {

//        제네릭을 사용하여
//        DBox <A,B>의
//        A에는 String
//        B에는 Integer를 사용한다고 지정하였다.
//        제네릭은 기본인자를 사용할 수 없고 대문자로 작성을 해줘야한다.

        DBox<String, Integer> box = new DBox();

        box.setA("홍길동");
        box.setB(20);

        System.out.println(box);

        Object obj = "스트링";
        String str = (String) obj;

    }
}
