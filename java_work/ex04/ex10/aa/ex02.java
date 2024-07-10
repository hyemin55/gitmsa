package aa;

public class ex02 {
    public static void main(String[] args) {

        CalSecond calSecond = new CalSecond();


        //        아래 두가지 출력문은 같다!
        int retValue = calSecond.inputNumber();
        System.out.println(retValue);
//        System.out.println(calSecond.inputNumber());

        String resultValue = calSecond.calculate(retValue);
        System.out.println(resultValue);
//        CalSecond calSecond2 = calSecond;
//        System.out.println(calSecond);
//        System.out.println(calSecond2);
    }
}
