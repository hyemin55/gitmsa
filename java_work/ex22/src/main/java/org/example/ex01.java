package org.example;

public class ex01 {
    public static void main(String[] args) {

//        primitive 함수가 없다.
        int a = 10;

//        wrapper 클래스이기 때문에 함수가 있다.
        Integer b = Integer.valueOf(20);

        System.out.println(a);
        System.out.println(b);

//        unboxing 래퍼클래스가 기본자료형 타입으로 자동 변환..
        a = b;
        a = b.intValue();
    }
}
