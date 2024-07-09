import java.util.Scanner;

import aa.bb.Fact;

public class Main {
    public static void main(String[] args) {
//        입력받는 변수 선언
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자입력");
        int result = scanner.nextInt();

        Fact aaaa = new Fact();
        int retValue = aaaa.aa(result);

        result = aaaa.aa(5);

        System.out.println("result = " + result);
        System.out.println("retValue = " + retValue);

//        Fact fact2 = new Fact();
    }
}