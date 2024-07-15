/*
  3. 다음은 answer 배열 에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’을 찍어서
    그래프를 그리는 프로그램이다 에 알맞은 코드를 넣어서 완성하시오 .
    int[] answer = { 1,4,4,3,1,4,4,2,1,3,2}
    실행결과
    1***
    2**
    3**
    4****
 */
public class exam03 {
    public static void main(String[] args) {
        int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
        int j = 0;
        for (int i = 0; i < answer.length; i++) {
           if(answer[i]==1){
               j++;
           }
        }

        System.out.print(1);


    }
}

