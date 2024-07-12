import java.util.Scanner;

/*
4. 문자열을 입력받아 거꾸로 출력하는 프로그램을 작성해보자
    예)
     입력 abcdef
     출력 fedcba

     입력 안녕하세요
     출력 요세하녕안
 */
public class exam4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String put = scanner.nextLine();

        char[] a = put.toCharArray();

        for (int i = a.length-1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }
}
