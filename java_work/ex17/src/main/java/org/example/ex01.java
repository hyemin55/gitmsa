package org.example;

import org.example.phone.MobilePhone;
import org.example.phone.SmartPhone;

public class ex01 {
    public static void main(String[] args) {
        SmartPhone smarphone = new SmartPhone("5.0",010123456);
        smarphone.show();

        MobilePhone mobilephone = new MobilePhone(010213456);
        mobilephone.show();
        }
    }

