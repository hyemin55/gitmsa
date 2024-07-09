//참조변수
class AAA{
    int count = 10;
}

public class ex03 {

    public static void main(String[] args) {
        AAA a1 = new AAA();
//        참조변수의 특성.
        AAA b1 = a1;

        System.out.println("a1.count = "+a1.count);
        System.out.println("b1.count = "+b1.count);

        a1.count = 30;

        System.out.println("a1.count = "+a1.count);
        System.out.println("b1.count = "+b1.count);

        int a = 10;
        int b = a;

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        b = 20;

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
