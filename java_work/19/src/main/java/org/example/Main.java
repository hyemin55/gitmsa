package org.example;

import org.example.Print.LgPrint;
import org.example.Print.SamPrint;
import org.example.inter.Printable;

// Ctrl+. 해당 범위 소스 접기
public class Main {
    public static void main(String[] args) {
        System.out.println(Printable.HEIGHT);
        System.out.println(Printable.WIDTH);

//        Math.random();
//        Math.

//        Printable.HEIGHT = 90; <= 값 재정의가 불가능하다.

        Printable prn = new LgPrint();
//        prn.print("asd");
        prn.print("내 문서");

        prn = new SamPrint();
        prn.print("내문서");

    }
}