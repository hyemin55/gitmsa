//     Alt+Insert => 아래의 생성자는단축키로 만들 수 있음
class Box {
    String conts;

    @Override
    public String toString() {
        return "Box{" +
                "conts='" + conts + '\'' +
                '}';
    }

    public Box(String conts) {
        this.conts = conts;
    }

}

public class ex04 {
    public static void main(String[] args) {
        Box[] boxs = new Box[5];
        boxs[0] = new Box("사과");

//        System.out.println(boxs[0].toString()); //toString()은 생략되어져 있다.

        for (int i = 0; i < boxs.length; i++) {
            System.out.println(boxs[i]);
        }
    }
}
