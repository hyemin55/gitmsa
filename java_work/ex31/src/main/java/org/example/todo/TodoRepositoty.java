package org.example.todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class TodoRepositoty {
    public void selecr(){
        try{

        }catch(Exception e){
            e.printStackTrace();
        }finally {

        }
    }
    public void insert(){
        if(TodoMain.MEBER.getIdx()==0){
            System.out.println("로그인 하셔야 합니다.");
            return;
        }

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/pmh")) {
         PreparedStatement pstnt = conn.prepareStatement(("""
                  INSERT INTO todo(dodate,content,member_idx)
                  values(?,?,?)
                  """);
         pstmt.setO
        } catch (Exception e) {
            e.printStackTrace();
        } ;
        PreparedStatement pstnt = conn.
    }
    public void update(){}
    public void delete(){}

}
