package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import static java.lang.Class.forName;

public class Main {
    public static void main(String[] args) {
/*1. Mysql 드라이버
build.gradle 라이브러리
2. Connection
3. Statement
*/
        try {
//           jar 파일 추가 확인
            Class.forName("com.mysql.cj.jdbc.Driver");
//           DB 연결
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/text", "root", "12341234");
//            sql 구문 만들기
            PreparedStatement pstmt = conn.prepareStatement("create table test02 (aa varchar(255), bb varchar(255))");
//            sql 구문 실행
            pstmt.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
