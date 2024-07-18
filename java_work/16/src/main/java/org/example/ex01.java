package org.example;

public class ex01 {
    ex01() {
        Box box = new Box("myBox");
        System.out.println(box);

        System.out.printf("%s\n","문자열 출력");

        int a = 10;
        int b = 20;


        System.out.printf("%d\n",a);
        System.out.printf("%f\n",(double)a);
        System.out.printf("%o\n",a);
        System.out.printf("%x\n",a);

        System.out.println(String.format("%d+%d = %d",a,b,a+b));
    }

    public static void main(String[] args) {
        new ex01();
    }
}
