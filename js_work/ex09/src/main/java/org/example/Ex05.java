package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Ex05 {
    public static void main(String[] args) throws IOException {
        Path fp = Paths.get("d:/a/lines.file");

        List list = Arrays.asList("test","글입니다.");

        Files.write(fp,list, StandardOpenOption.APPEND);

        List<String> readlist = Files.readAllLines(fp);
        System.out.println(readlist);

//        위와 아래 방법 두가지가 있다.
//        속도는 아래가 조금 더 빠르다고 한다.
//        BufferedReader br = new BufferedReader((new FileReader("d:/a/lines.file")));
//        br.readLine();
    }
}
