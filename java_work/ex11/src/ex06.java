import java.util.Arrays;

class A{
    String name;
}

public class ex06 {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 5};
        int br[] = ar;

        br[0] = 10;

        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[1]);
        }
        System.out.println();

        for (int i = 0; i < br.length; i++) {
            System.out.println(br[i]);
        }
        A a = new A();
        A b = a;
        a.name = "홍길동";
        System.out.println("a.name = "+a.name);
        System.out.println("b.name = "+b.name);
    }
}
