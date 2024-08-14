package org.example;

public class Main {
    public static void main(String[] args) {
//        SteelBox<String> steelBox = new SteelBox<>();
//        steelBox.setT("test");
//
//        System.out.println(steelBox.getT());

        BoxFactory.<Integer>peekBox(new Box<>(10));
        BoxFactory.peekBox2(new Box<>(20));
        BoxFactory.peekBox2(new Box<>(20.3d));
        BoxFactory.peekBox3(new Box<>(1+"합쳐도들어가네"));

//      BoxFactory.peekBox2(new Box<>("Box<? extends Number>로 받기때문에 스트링 안들어간다.");
    }
}