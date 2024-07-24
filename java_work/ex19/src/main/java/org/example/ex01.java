package org.example;

import org.example.Print.CMYKPrinter;
import org.example.inter.CMYKPrintable;
import org.example.inter.Printable;

public class ex01 {
    public static void main(String[] args) {
//        2개의 변수 WIDTH, HEIGHT
//        2개의 메서드 print(), cmykprint();
//        메모리 상에는 WIDTH, HEIGHT가 한개씩만 존재하기 때문에 참조를 두가지로 할 수 있다.
        System.out.println(Printable.WIDTH);
        System.out.println(CMYKPrintable.HEIGHT);

        CMYKPrintable prn = new CMYKPrinter();
        prn.print("옛날프린터기");

//
        prn.clean();
        Printable.printLine();
        prn.printCMYK("내문서");
    }
}
