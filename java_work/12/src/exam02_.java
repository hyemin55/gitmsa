public class exam02_ {
//    2. int[][] arr = {
//            { 5, 5, 5, 5, 5},
//            {10,10,10,10,10},
//            {20,20,20,20,20},
//            {30,30,30,30,30}
//    };
//    arr 배열을 총합과 평균을 구하는 프로그램을 작성하세요

    public static void main(String[] args) {

        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10, 10, 10},
                {20, 20, 20, 20, 20},
                {30, 30, 30, 30, 30}
        };

        float sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                sum += arr[i][j];

                if (i + 1 == arr.length && j + 1 == arr[i].length) {
                    System.out.println("배열 총합 = " + sum);
                    System.out.println("배열 총합의 평균 = " + sum / (arr.length * arr[i].length));
                }
            }
        }
    }
}
