package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ex06 {
    public static void main(String[] args) {

        try {
//            DB 연결 유지 클래스이다.
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/aaa", "root", "1234");
            System.out.println("되니?");

            PreparedStatement pstnt = conn.prepareStatement("INSERT INTO student values('김길동','100','100','100')");

            pstnt.executeLargeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
