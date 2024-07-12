public class ex04 {
//    기본생성자 toString() 생략되어있다.
//    toString()을 적어주면 그 안의 return 값을 넣어줄 수 있다.

    ex04() {
        int ar[] = {10, 20, 30, 40, 50};
        doA(ar);
        int br[] = makeary(10);
        System.out.println("br.length = "+br.length);
    }

    public void doA(int[] qw) {

        int sum = 0;
        for (int i = 0; i < qw.length; i++) {
            sum = sum + qw[i];
        }
        System.out.println(sum);
    }
    public int[] makeary(int len){
        return new int[len];
    }

    public static void main(String[] args) {

        ex04 ex05 = new ex04();

    }
}
