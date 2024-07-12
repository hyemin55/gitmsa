import aa.Box;
//aa 디렉토리 안의 Box를 가져오려면 import를 적어준다.

public class Main {
    public static void main(String[] args) {

//        인스턴스화 메모리에 적재 된다.
        Box abox = new Box("사과");
        Box bbox = new Box();
        Box cbox = new Box("바나나",10);

        System.out.println(abox.toString()); //toString이 숨어있다.
        System.out.println(bbox);
        System.out.println(cbox);
    }
}
