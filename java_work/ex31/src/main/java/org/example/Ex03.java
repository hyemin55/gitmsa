package org.example;

import java.io.FileReader;
import java.io.IOException;

public class Ex03 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("myfile");


        while(true){
//        한문자 읽어오기
            int ch = fr.read();
            System.out.println(ch);
            System.out.println((char)ch);

            if(ch==-1)
                break;
        }
//        int ch = fr.read();
//        System.out.println(ch);
//        System.out.println((char)ch);
    }
}
