public class ex03 {
    public static void main(String[] args) {

        int a[] = new int[10];
//        a의 공간을 10개 만들어 주는 배열이다.

        int b[] = {1,2,3,4};
//        b의 공간이 4개 만들어져 있고 0~3까지 출력을하면 1,2,3,4가 출력된다.

        System.out.println("a.length = "+a.length); //a배열의 길이값이 나온다.
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        a[0] = 20;
        System.out.println(a[0]);

        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);

        int c[] = b; //참조변수!
        System.out.println(c[2]);
    }
}
