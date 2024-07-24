package org.example;

import org.example.aa.KiaCar;
import org.example.aa.SamsungCar;

public class Main {
    public static void main(String[] args) {

        SamsungCar samsungcar = new SamsungCar("XM3","Nomal","Samsung");
        KiaCar kiacar = new KiaCar("MONING","CUTE","KIA");

        System.out.println(samsungcar);
        System.out.println(kiacar);
    }
}