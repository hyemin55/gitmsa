package org.example;

import org.example.member.Member;
import org.example.member.MemberRepository;
import java.util.Scanner;

public class TodoMain {


//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;

    private MemberRepository memberRepository = new MemberRepository();

    public static Member MEMBER;

    TodoMain() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    선택하세요
                    0. login
                    1. aa select
                    2. aa insert
                    3. aa update
                    4. aa delete

                    5. todo select
                    6. todo insert
                    7. todo update
                    8. todo delete
                    """);
            int ra = scanner.nextInt();

            if(ra==0){
                System.out.println("사용자 번호를 입력하세요.");
                int member_idx = scanner.nextInt();
                TodoMain.MEMBER = memberRepository.findByIdx(member_idx);
                if(MEMBER == null){
                    System.out.println("로그인 실패");
                }else{
                    System.out.println("로그인 성공");
                }
                System.out.println(TodoMain.MEMBER);
            }else if (ra == 1) {
                memberRepository.select();
            } else if (ra == 2) {
                memberRepository.insert();
            } else if (ra == 4){
//                memberRepository.delete();
            }else {
                System.out.println("종료됩니다.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        new TodoMain();
    }
}
