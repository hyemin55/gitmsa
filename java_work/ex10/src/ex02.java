import aa.A;
//aa패키지 안의 A클래스를 가져온다는 의미이다.
import aa.B;
//import aa.*; <=이건 aa패키지 안의 모든 클래스를 다 가져온다.


public class ex02 {
    public static void main(String[] args) {
        A a = new A();
        a.aa();

        bb.A aa = new bb.A();
        aa.bb();
        exam1 exam1 = new exam1();
    }
}
