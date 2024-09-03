package org.example;

import java.io.*;

public class Ex04 {
    public static void main(String[] args) throws Exception {
//        true를 적으면 기존의 내용에 추가로 작성이된다.
//        기본값은 false이기에 기존의 내용은 삭제되고 새로 작성이된다.
        BufferedWriter bw = new BufferedWriter(new FileWriter("myfile", true));

        bw.write("글자를 추가할거야!");
        bw.write("추가됐어?");
        bw.close();


//        BufferedWriter bw = new BufferedWriter(new FileWriter("myfile", false));
//        bw.write("글자를 바꿀거야!");
//        bw.write("바꼇어?");
//        bw.close();


        BufferedReader fr = new BufferedReader(new FileReader("myfile"));

        while (true) {
//        한문자 읽어오기
            String str = fr.readLine();
            System.out.println(str);

            if (str == null)
                break;
        }
        fr.close();
    }
}
