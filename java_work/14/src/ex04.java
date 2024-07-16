class InstClass {
    static int num = 0;

    InstClass() {

        num++;
        System.out.println(num);
    }
}

public class ex04 {
    public static void main(String[] args) {
        System.out.println(InstClass.num);
        new InstClass();
        new InstClass();
        new InstClass();
        new InstClass();

        InstClass in1 = new InstClass();
        System.out.println(in1.num);
    }
}
