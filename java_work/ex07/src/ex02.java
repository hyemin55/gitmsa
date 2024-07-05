public class ex02 {
// 1+(-2)+3+(-4)+...과같은 식으로 계속 더해나갔을 때,
// 몇까지 더해야 총합이 100이상이 되는지 구하시오.
    public static void main(String[] args) {

//        break는 while, for, switch 빠져나오기.
//        continue는 다음코드를 진행하지 않고 for(조건검사)로 다시 올라간다.
        int sum = 0;
        for (int i = 1; ; i++) {
            System.out.println("i = "+i);

            if(i % 2 == 0){
            sum = sum - i;
            } else {
                sum = sum + i;
            }
            System.out.println("중간sum = "+sum);

            if (sum > 100)
                break;
        }

        System.out.println(sum);
    }
}
