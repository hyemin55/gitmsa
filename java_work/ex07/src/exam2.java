//  Math.random을 이용해서 1부터 6사이의 임의의 정수를
//  변수 value에 저장하는 코드를 완성하여라.
//  (1)에 알맞은 코드를 넣으세요.
// 1, 2번 다 풀면 함수로 교체.

public class exam2 {

    public static void main(String[] args) {

        for(int i = 1; i < 2 ; i++){
            double value = Math.random()*6+1;
            System.out.println((int)value);
        }
    }
}