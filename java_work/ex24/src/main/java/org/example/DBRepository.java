package org.example;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBRepository {
    /*
    1. class.forname jar 파일 추가 확인
    2. Connection DB 연결
    3. PrepareStatement sql 구문 작성
    4. sql 구문 실행
    executeUpdate(); -> insert, update, delete, create, alter 문 실행할때
    executeQuery(); -> select문 실행할 때
     */
    public void insert() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
//            DB 연결
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh", "root", "12341234");
//            sql 생성
            pstmt = conn.prepareStatement("INSERT INTO aa (name,age) VALUES (?,?)");
            String name = JOptionPane.showInputDialog("이름");
            pstmt.setString(1,"김길동");
            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            pstmt.setInt(2,100);

//            sql 구문 실행
            pstmt.executeUpdate();
        } catch (Exception e) {

        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {

            }
        }
    }
    public void delete() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
//            DB 연결
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh", "root", "12341234");
//            sql 생성
            pstmt = conn.prepareStatement("delete from aa where idx=?");
            int idx = Integer.parseInt(JOptionPane.showInputDialog("idx"));
            pstmt.setInt(1,idx);

//            sql 구문 실행
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {

            }
        }
    }
    public void update() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
//            DB 연결
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh", "root", "12341234");
//            sql 생성
            pstmt = conn.prepareStatement("UPDATE aa SET name=?, age=? WHERE idx=?");
            String name = JOptionPane.showInputDialog("이름");
            pstmt.setString(1,name);
            int age = Integer.parseInt(JOptionPane.showInputDialog("나이"));
            pstmt.setInt(2,age);
            int idx = Integer.parseInt(JOptionPane.showInputDialog("idx"));
            pstmt.setInt(3,idx);

//            sql 구문 실행
            pstmt.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {

            }
        }
    }
    public void select() {
        Connection conn = null;
        PreparedStatement pstmt = null;

//      select 해서 반환되는 테이블 받기.
        ResultSet rs = null;
        try {
//            DB 연결
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh", "root", "12341234");
//            sql 생성
            pstmt = conn.prepareStatement("SELECT * FROM aa");

//            sql 구문 실행
            rs = pstmt.executeQuery();
            while(rs.next()){
//            System.out.print(rs.getInt("idx"));
//            System.out.print(rs.getString("name"));
//            System.out.println(rs.getInt("age"));
            System.out.println("""
            idx = %d
            name = %s
            age = %d
            """.formatted(rs.getInt("idx"),rs.getString("name"),rs.getInt("age")));
            }
        } catch (Exception e) {

        } finally {
            try {
                if (pstmt != null)
                    pstmt.close();
                if (conn != null)
                    conn.close();
            } catch (Exception e) {

            }
        }
    }
}
