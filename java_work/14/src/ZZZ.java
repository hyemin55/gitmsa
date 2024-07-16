//import aa.AAA;

//extends AAA <=상속받을 클래스를 적으면 import 까지 적어거나 경로를 모두 적어준다.
public class ZZZ extends aa.AAA {

    int zzz=10;

    ZZZ(){
        System.out.println("여기에서 할꺼에요");
        System.out.println(zzz);
        System.out.println(aaa);
    }
    public static void main(String[] args) {
        new ZZZ();
    }
}
