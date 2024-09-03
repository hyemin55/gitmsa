package org.example;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MemberRepository {
    //        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
    public void select() {
        List<Member> list = new ArrayList<>();
        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh", "root", "12341234")) {
//            Class.forName("com.mysql.cj.jdbc.Driver");

            // 인텔리 제이 단축키 대문자 변환 ctrl + shift + u
            PreparedStatement pstmt = conn.prepareStatement("select * from aa order by idx desc");
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Member member = Member.builder()
                        .name(rs.getString("name"))
                        .idx(rs.getInt("idx"))
                        .age(rs.getInt("age"))
                        .regdate(rs.getObject("regdate", LocalDateTime.class))
                        .mydate(rs.getObject("mydate", LocalDateTime.class))
                        .build();
                list.add(member);
            }
            list.stream().forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insert() {
        try (Connection conn =
                     DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh", "root", "12341234")) {
            Class.forName("com.mysql.cj.jdbc.Driver");

            PreparedStatement pstmt = conn.prepareStatement("""
                        INSERT INTO aa 
                            (NAME,age,email,password,mydate)
                        values
                            (?,?,?,?,?)
                    """);
            pstmt.setString(1,"홍길동이");
            pstmt.setInt(2,10);
            pstmt.setString(3,"fhdskfh@naver.com");
            pstmt.setString(4,"fhdsfsfsf");
            pstmt.setObject(5,LocalDateTime.now());
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        public void delete() {
            try (Connection conn =
                         DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh", "root", "12341234")) {
                Class.forName("com.mysql.cj.jdbc.Driver");

                PreparedStatement pstmt = conn.prepareStatement("""
                        INSERT INTO aa 
                            (NAME,age,email,password,mydate)
                        values
                            (?,?,?,?,?)
                    """);
                pstmt.setString(1,"홍길동이");
                pstmt.setInt(2,10);
                pstmt.setString(3,"fhdskfh@naver.com");
                pstmt.setString(4,"fhdsfsfsf");
                pstmt.setObject(5,LocalDateTime.now());
                pstmt.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }
    }
}





