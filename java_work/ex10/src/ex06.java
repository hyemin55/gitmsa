/*
char[]는 배열이다.
String -> char[]
char[] -> String
 */

public class ex06 {
    public static void main(String[] args) {

        String str = "우리는 할 수 있다.";
        char[] chars = str.toCharArray();
//        char를 사용하면 toCharArray()가 들어가야한다.
//        그러면 한글자씩 출력할 수 있다.
        System.out.println(chars);

        System.out.println("str의 문자갯수 = "+chars.length);
        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[2]);
        System.out.println(chars[3]);
        System.out.println(chars[4]);
        System.out.println(chars[5]);
        System.out.println(chars[6]);

        chars[4] = 'A';
        System.out.println(chars[4]);

        String aa = new String(chars);
        System.out.println(aa);
    }
}
