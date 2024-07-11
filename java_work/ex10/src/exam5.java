/*
1. 길이가 10인 배열을 선언하고 총 10개의 정수를 입력받아서,
홀수와 짝수를 구분 지어 출력하는 프로그램을 작성해 보자.
일단 홀수부터 출력하고 나서 짝수를 출력하도록 하자.
단, 10개의 정수는 main 함수 내에서 입력받도록 하고,
배열 내에 존재하는 홀수만 출력하는 함수와 배열 내에 존재하는 짝수만 출력하는 함수를 각각 정의해서
 이 두 함수를 호출하는 방식으로 프로그램을 완성하자.
 */

import java.util.Scanner;

class A {
    public void doA(int[] a) {

        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (a[j] % 2 != 0) {
                System.out.print(a[j] + "\t");
            }
            j++;
        }
    }
}

class B {
    public void doB(int[] a) {
        int j = 0;
        for (int i = 0; i < 10; i++) {
            if (a[j] % 2 == 0) {
                System.out.print(a[j] + "\t");
            }
            j++;
        }
    }

    public static class exam5 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] a = new int[10];
            for (int i = 0; i < 10; i++) {
                a[i] = scanner.nextInt();
            }
            System.out.println("a의 문자 수 = " + a.length);

            A aa = new A();
            aa.doA(a);

            System.out.println("\n");

            B bb = new B();
            bb.doB(a);

        }
    }
}
