package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex07 {


//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;

    private MemberRepository memberRepository = new MemberRepository();

    ex07() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    선택하세요
                    1. select
                    2. insert
                    3. update
                    4.delete
                    """);
            int ra = scanner.nextInt();

            if (ra == 1) {
                memberRepository.select();
            } else if (ra == 2) {
                memberRepository.insert();
            } else {
                System.out.println("종료됩니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        new ex07();
    }
}
