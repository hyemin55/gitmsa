import java.util.Scanner;

/*
1. 문자열을 입력받아 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
    제한사항 1<= str의 길이 <=10
    입력 #1
    abcde
    출력
    a
    b
    c
    d
    e
 */
//class order {
//    public static String num(String num) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        char[] output = input.toCharArray();
//        System.out.println(output.length);
//        return output[];
//
//    }
//
//}

public class exam01 {
    public static void main(String[] args) {
        System.out.println("문자를 10자 이내로 입력하세요.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] output = input.toCharArray();
        System.out.println(output.length);
        if (output.length > 10) {
            System.out.println("최대 문자 길이를 초과하였습니다. 문자를 10자 이내로 입력하세요.");
            input = scanner.nextLine();
            char[] a = input.toCharArray();
             if (a.length <= 10){
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
