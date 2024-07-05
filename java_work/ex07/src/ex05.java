import java.util.Scanner;

public class ex05 {

//        1+2+3+4+~ +10까지 더하는 메서드
//        void 는 main함수의 doA()로 되돌려주지 않는다.
    public static void doA(int end){
        int sum = 0;
        for (int i = 1; i < end + 1 ; i++){
            sum +=i;
        }
        System.out.println("1부터 " + end + "까지 더한 수" + sum);
    }

//        1*2*3*4*5*6*~ *10까지 곱하는 메서드
    public static void doB(int end){
        int sum = 1;
        // i++은 i=1을 먼저 실행한 후 다시 돌아와서 추가해준다.
        for (int i = 1; i < end + 1 ; i++){
            sum = sum * i;
        }
        System.out.println("1부터 " + end + "까지 곱한 수" + sum);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("몇까지 더할까요?");
        int test = scanner.nextInt();

        doA(test);
        doB(test);


    }
}
