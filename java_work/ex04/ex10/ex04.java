class B{
//    toString은 생략. 개발자가 임의적으로 적게되면 적었는 내용을 실행한다.
//    public String toString(){}
//    생성자도 생략가능.
    int a = 10;
    public B(){
        System.out.println("생성자");
        a = 20;
    }

}
//생성자는 함수랑 비슷한 모양이지만 반환값을 적지 않는다.
public class ex04 {
    public static void main(String[] args) {

        B b = new B();
        System.out.println(b.a);
    }
}
