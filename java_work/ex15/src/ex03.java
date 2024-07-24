public class ex03 {
    public static void main(String[] args) {

        String str1 = "new String";
        String str2 = "new String";

        System.out.println(str1==str2);

        String str3 = new String("new String");
        String str4 = new String("new String");

        System.out.println(str3==str4);
//        .equals()는 문자열이 같은지 비교한다.
        System.out.println(str3.equals(str4));
    }
}
