public class ex05 {
    public static void main(String[] args) {

        String str = "a1b1c1";
        String[] tempstr = str.split("1");
//        split은 ()안의 조건을 기준으로 나누어준다.
//        엑셀에서 복붙할 때 셀 나누는 기준과 같아보인다.

        for(int i = 0; i<tempstr.length; i++){
            System.out.println(tempstr[i]);
        }


        String a = "abcdefgh";
        System.out.println(a.length());
//      a.length() 의 문자의 갯수
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));

        System.out.println(a.substring(2)); //2번째 문자부터 출력
        System.out.println(a.substring(2,5)); //2에서 5까지의 문자 출력
        System.out.println(a.toUpperCase()); //대문자로 출력
        System.out.println("cd를 포함하냐 = "+a.contains("cd")); //조건검사

        System.out.println("배열출력시작");
        char[] test = a.toCharArray();
        for(int i = 0; i < test.length; i++){
            System.out.println(test[i]);
        }
        System.out.println("배열출력끝");

        test[2] = 'A';
        String testStr = new String(test);
        System.out.println(test);

        int[] b = new int[3];
        System.out.println(b.length);
//      b.length() 의 문자의 갯수
    }
}
