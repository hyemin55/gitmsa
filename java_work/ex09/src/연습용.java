class BBB{
    public void doA(CCC c){

    }
}

class CCC{
    int num = 20;
}

public class 연습용 {
    public static void main(String[] args) {
        BBB bb=new BBB();
        CCC cc=new CCC();

        bb.doA(cc);
        System.out.println(cc.num);
    }
}
