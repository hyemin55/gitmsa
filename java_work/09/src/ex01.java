// 클래스 정의
/* main은 메모리에 무조건 존재한다.
*
*
*/


class A{
    int num = 10;
    public void doA(){
        System.out.println("아무거나 만들기");
    }
}

//목록의 이름이 초록색인 것은 깃허브에 업로드 안한 파일이다.

public class ex01 {
    public static void main(String[] args) {

        int num = 10;
        int num2 = 20;
        int num3 = 30;

//        선언하는 순간 메모리에 적재된다.
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
//        a1, a2, a3 는 참조변수
//        new는 객채열기.

        System.out.println(a1.num);
        a1.doA();
        a1. num = 30;
        System.out.println("a1.num = "+a1.num);

        System.out.println("a2.num = "+a2.num);
        a2.doA();
    }
}
