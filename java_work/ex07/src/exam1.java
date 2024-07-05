//  두 개의 주사를 던졌을 때,
//  눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오.

public class exam1 {

    public static void main(String[] args) {

        int sum = 0;
        for (int a = 1; a < 7; a++) {
            for (int b = 1; b < 7; b++) {
                if (a + b == 6)
                    System.out.println("주사위 a =" + a + " 주사위 b = " + b + " = " + (a + b));
            }
            sum++;
        }
        System.out.println("합이 6이 되는 경우의 수 = "+sum);
    }
}
