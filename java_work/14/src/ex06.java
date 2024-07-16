class Test{
    public static void doA(){
        System.out.println("static doA");
    }
    public void doB(){
        System.out.println("그냥.. instance doB");
    }
}
public class ex06 {

    int num = 0;
    static void Add(int n){
//      아래 n은 static안에 있어서 메모리에 적재가 되었지만
//        num은 비static에 있어서 불가능한 변수이다.
//        num +=n;
    }

    public static void main(String[] args) {
        Test.doA();
        Test test = new Test();
        test.doB();

//      실행은 되지만 비선호..
        test.doA();

    }
}
