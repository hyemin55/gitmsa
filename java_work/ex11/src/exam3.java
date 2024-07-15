import java.util.Scanner;

/*
    3. 프로그램 사용자로부터 10진수 형태로 정수를 하나 입력받은 다음,
    이를 2진수로 변환해서 출력하는 프로그램을 작성해 보자.
 */
//클래스는 데이터(필드,클래스변수,인스턴스변수)와 메서드(함수,클래스함수,인스턴스함수)로 이루어져있다.
class Exam {
    Scanner scan = new Scanner(System.in);

    public int inputNumber() {
        System.out.println("숫자 입력");
        int inputNumber = scan.nextInt();
        System.out.println("inputNumber = " + inputNumber);
        return inputNumber;
    }
}

public class exam3 {
    public static void main(String[] args) {
        Exam exam = new Exam();
        int result = exam.inputNumber();
        System.out.println("main.result = " + result);

        int 몫, 나머지;
        몫 = result / 2;
        나머지 = result % 2;

        System.out.println("몫 = " + 몫);
        System.out.println("나머지 = " + 나머지);

        String 나머지들 = "" + 나머지;

        System.out.println("몫 = " + 몫);
        System.out.println("나머지 = " + 나머지);
        System.out.println("나머지들 = " + 나머지들);

        while (true) {
            나머지 = 몫 % 2;
            몫 = 몫 / 2;
            나머지들 = 나머지 + 나머지들;

            if (몫 < 2) {
                if (몫 != 0) {
                    System.out.println("나머지들 = " + 나머지들);
                }
                break;
            }

        }
    }
}