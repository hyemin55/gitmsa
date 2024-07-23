package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            System.out.println("구매할 수량을 입력해주세요.");

            try {
                System.out.print("녹차브라우니 : ");
                int a = scanner.nextInt();
                System.out.print("솔티드카라멜 : ");
                int b = scanner.nextInt();
                System.out.print("얼그레이밀크티 : ");
                int c = scanner.nextInt();
                System.out.print("리얼크림치즈 : ");
                int d = scanner.nextInt();
                System.out.print("오레오크림치즈 : ");
                int e = scanner.nextInt();
                System.out.print("초코티라미수 : ");
                int f = scanner.nextInt();
                System.out.print("곡물초코 : ");
                int g = scanner.nextInt();
                System.out.print("블루베리크림치즈 : ");
                int h = scanner.nextInt();
                System.out.println("총 수량 : " + (a + b + c + d + e + f + g + h) + "개");

                Sum sum = new Sum();
                System.out.println("결제금액 : " + sum.total(a, b, c, d, e, f, g, h) + "원");
                break;
            } catch (Exception in) {
                System.out.println("잘못 입력 되었습니다. 숫자를 입력해 주세요.\n");
                scanner.nextLine();
            }
        }
    }
}