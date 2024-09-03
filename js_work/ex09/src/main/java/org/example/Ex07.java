package org.example;

import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex07 {
    public static void main(String[] args) {

        Path path = Paths.get("cc");

        try(
            OutputStream outputStream = Files.newOutputStream(path)){
//            10은 유니코드로 변환 시 줄바꿈이다.
            outputStream.write(10);
            outputStream.write(65);
            outputStream.write(100);
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
