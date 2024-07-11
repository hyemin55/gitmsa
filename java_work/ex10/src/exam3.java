//재귀함수. 입력값의 n승을 구하는 방법.
import java.util.Scanner;

class Fact{
//    매서드는 반환값을 적게 되면 반환값이 무조건 있어야한다.
//    반환값을 else로 넣을 수 있다.
    public int fact(int num){
        System.out.println("여기오나"+num);
        if(num>0)
            return 2 * fact(num-1);
        else{
            return 1;
        }
    }
}

public class exam3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇승 구할래?");

        String a = scanner.nextLine();
//      String을 int로 바꿀때(문자를 숫자로 받음)
//        int -> String 10+"";
//        문자열 입력 -> scan.nextLine / 숫자입력 -> scan.nextInt
        int num = Integer.parseInt(a);

//        클래스의 정의와 인스턴스화.
        Fact fact = new Fact();
        int result = fact.fact(num);
        System.out.println("result = "+result);
    }
}
