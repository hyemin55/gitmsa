package org.example;

public class ex01 {

    public static void md1() {
        md2(10, 0);
    }

    private static void md2(int n1, int n2) {
        System.out.println(n1 / n2);
    }

    public static void main(String[] args) {
        md1();
    }
}
