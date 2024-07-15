/*
   2. int[][] arr = {
        { 5, 5, 5, 5, 5},
        {10,10,10,10,10},
        {20,20,20,20,20},
        {30,30,30,30,30}
    };
    arr 배열을 총합과 평균을 구하는 프로그램을 작성하세요
 */
public class exam02 {
    public static void main(String[] args) {
        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };
        int sum = 0;
        float avr = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
//                arr[i] = 열(5), arr[j] = 행(4) 이다.
                sum = sum + arr[i][j];
                avr = arr.length * arr[i].length;
//                System.out.print(arr.length+"\t");
//                System.out.println();
//                System.out.print(arr[i].length+"\t");
            }
        }
        System.out.println("총합 = "+sum);
        System.out.println("평균 = "+sum / avr);
    }
}
