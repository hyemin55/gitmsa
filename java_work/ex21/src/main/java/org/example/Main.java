package org.example;

public class Main {
    public static void main(String[] args) {

        AA AA1 = new AA("AA");
        AA AA2 = new AA("AA");
        AA AA3 = new AA("AAA");

        AA1.printThis(AA2);
        AA2.printThis(AA2);

        System.out.println(AA1);
        System.out.println(AA2);
        System.out.println(AA3);

        System.out.println(AA1.equals(AA2));
        System.out.println(AA2.equals(AA1));
        System.out.println(AA3.equals(AA1));

        System.out.println(AA1 == AA2);
    }
}