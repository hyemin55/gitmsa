/*
3. 구구단의 일부분을 다음과 같이 출력하시오
    2*1=2       3*1=3       4*1=4
    2*2=4       3*2=6       4*2=8
    2*3=6       3*3=9       4*3=12

    5*1=5       6*1=6       7*1=7
    5*2=10      6*2=12      7*2=14
    5*3=15      6*3=18      7*3=21

    8*1=8       9*1=9
    8*2=16      9*2=18
    8*3=24      9*3=27
 */
public class exam2 {
    public static void main(String[] args) {
        int num = 2;
        int value = 1;
        int a = 1;

        for (num = 1; num < 2; num++) {
            for (a = 2; a < 5; a++) {
                value = num * a;
                System.out.print(a + "*" + num + "=" + value+"\t");

            }
        }
        System.out.println();
        for (num = 2; num < 3; num++) {
            for (a = 2; a < 5; a++) {
                value = num * a;
                System.out.print(a + "*" + num + "=" + value+"\t");
            }
        }
        System.out.println();
        for (num = 3; num < 4; num++) {
            for (a = 2; a < 5; a++) {
                value = num * a;
                System.out.print(a + "*" + num + "=" + value+"\t");
            }
        }
        System.out.println("\n");
        for (num = 1; num < 2; num++) {
            for (a = 5; a < 8; a++) {
                value = num * a;
                System.out.print(a + "*" + num + "=" + value+"\t");
            }
        }
        System.out.println();
        for (num = 2; num < 3; num++) {
            for (a = 5; a < 8; a++) {
                value = num * a;
                System.out.print(a + "*" + num + "=" + value+"\t");
            }
        }
        System.out.println();
        for (num = 3; num < 4; num++) {
            for (a = 5; a < 8; a++) {
                value = num * a;
                System.out.print(a + "*" + num + "=" + value+"\t");
            }
        }
        System.out.println("\n");
        for (num = 1; num < 2; num++) {
            for (a = 8; a < 10; a++) {
                value = num * a;
                System.out.print(a + "*" + num + "=" + value+"\t");
            }
        }
        System.out.println();
        for (num = 2; num < 3; num++) {
            for (a = 8; a < 10; a++) {
                value = num * a;
                System.out.print(a + "*" + num + "=" + value+"\t");
            }
        }
        System.out.println();
        for (num = 3; num < 4; num++) {
            for (a = 8; a < 10; a++) {
                value = num * a;
                System.out.print(a + "*" + num + "=" + value+"\t");
            }
        }
    }
}

//public class Ex1 {
//    public static void main(String[] args) {
//
//        for (int i = 1; i<10; i++) {
//            int num1 = (2 * (i - 1)) + 2;
//            int num2 = (3 * (i - 1)) + 3;
//
//            System.out.print("2*"+i+"="+num1);
//            System.out.print("\t");
//            System.out.print("3*"+i+"="+num2+"\n");
//
//        }
//
//    }
//}