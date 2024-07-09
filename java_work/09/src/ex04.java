// 참조변수의 특성.
class BB{
    int num = 10;
}

class CC{
    public void doA(BB b){
        System.out.println("b.num = "+b.num);
        b.num = 30;
    }
}

public class ex04 {
    public static void main(String[] args) {

        BB bb = new BB();
        CC cc = new CC();

        cc.doA(bb);
//      cc.doA(new BB); <-이렇게 적으면 새롭게 객채를 형성한다.
        System.out.println("bb.num = "+bb.num);

        bb = null;
    }
}
