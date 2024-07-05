public class ex08 {

    public static void main(String[] args) {

  // Math.random()는 0~1까지의 실수 중에 랜덤하게 값이 나온다.
  // Math.random()*100은 1~99까지의 실수 중에 랜덤하게 값이 나온다.
        double result = Math.random();
        System.out.println(result*10);

  // 랜덤한 값이 정수로 나온다.
        System.out.println((int) result);

/*
        System.out.println();
         for (int i = 0; i < 20; i++){
            double result = Math.random()*100;

            System.out.println((int)result);
 */
    }
}

