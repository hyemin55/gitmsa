package org.example;

public class ex01 {
    public static void main(String[] args) {
        BoxFactory.peekBox4(new Box<>(new AA()));
        BoxFactory.peekBox4(new Box<>(new BB()));
        BoxFactory.peekBox4(new Box<>(new CC()));

//      상한제한이라 안된다.
//        BoxFactory.peekBox4(new Box<>(new Object()));

        BoxFactory.peekBox5(new Box<Object>(new CC()));
        BoxFactory.peekBox5(new Box<AA>(new CC()));
        BoxFactory.peekBox5(new Box<BB>(new CC()));
//      상한제한이라 안된다.
//        BoxFactory.peekBox5(new Box<CC>(new CC()));
    }
}
