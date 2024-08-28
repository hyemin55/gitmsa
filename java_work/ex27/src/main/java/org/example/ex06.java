package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ex06 {
    public static void main(String[] args) {

        aaDBRespository aaDBRespository = new aaDBRespository();

        List<Member> list = aaDBRespository.select();

//        아래 두가지 모두 사용가능.
//        list.stream().forEach(s-> System.out.println(s));
        list.stream().forEach(System.out::println);
    }
}
