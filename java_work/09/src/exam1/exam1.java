//package exam1;
///*1. 가위 바위 보 게임을 만들어 보자.
//사용자로부터 가위 바위 보 중에서 하나를 입력 받는다.
//그리고 컴퓨터는 난수 생성을 통해서 가위 바위 보 중에서 하나를 선택하게 한다.
//이 둘을 비교해서 승자와 패자를 가려주는 프로그램을 작성해 보자.
//단, 프로그램의 진행은 사용자가 질 때까지 계속되어야 하고,
//마지막에 가서는 게임의 결과(예: 4승 3무)까지 출력해 주도록 하자.
//*/
//
//import java.util.Scanner;
//
//public class exam1 {
//    public static void main(String[] args) {
//
//        int a = 0;
//        int b = 0;
//
//        while (true) {
//            String qq = aa();
//
//            if (qq.equals("졌다")) {
//                break;
//            } else if (qq.equals("이겼다")) {
//                a++;
//            } else if (qq.equals("비겼다")) {
//                b++;
//            }
//        }
//        System.out.println(a + "승" + b + "무" + "1패");
//    }
//
//    public static String aa() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("가위(0) 바위(1) 보(2) 중 선택하세요");
//
//        String result = scan.nextLine();
//
//        int a = (int) (Math.random() * 3);
//
//        if (result == a) {
//            System.out.println("비겼다");
//            return "비겼다";
//        } else if (result.equals(b) {
//            System.out.println("이겼다");
//            return "이겼다";
//        } else if (result.equals(c)) {
//            System.out.println("졌다");
//            return "졌다";
//        }
//
//        return "asdasdasdasdasd";
//    }
////    public static String a(){
//
//}
