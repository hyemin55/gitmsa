/*
    1. 배열 [10,20,30,40,50] 알맞은 코드를 넣어 총합과 평균을 구하세요
*/
public class exam1 {
    public static void main(String[] args) {

        int [] a = {10,20,30,40,50};
        int sum = 0;
        int avr = 0;
        for(int i = 0; i<a.length;i++){
            sum = a[i]+sum;
        }
        System.out.println("총합 = "+sum);
        avr = sum/a.length;
        System.out.println("평균 = "+avr);
    }
}
