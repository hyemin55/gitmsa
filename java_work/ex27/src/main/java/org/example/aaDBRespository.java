package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class aaDBRespository {
    public List<Member> select(){
        List<Member> list = new ArrayList<>();

        Connection conn = null; //DB연결 객체
        PreparedStatement pstmt = null; // sql 작성 객체
        ResultSet rs = null; // select문 테이블 담는 객체

        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); //jar 파일 추가 되어 있는지 확인
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh", "root", "12341234"); //DB연결
            pstmt = conn.prepareStatement("select * from aa"); //sql 구문 작성
            rs = pstmt.executeQuery(); //sql 구문 실행

            while (rs.next()) {
                Member aa = new Member(
                        rs.getInt("idx"),
                        rs.getString("name"),
                        rs.getInt("age"),
                        rs.getString("email"),
                        rs.getString("password"));
                list.add(aa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }return list;
    }
}
