public class ex02 {
    public static void main(String[] args) {

        String a = "abcd";
        String b = "java";
        String c = "system";

        System.out.println(a.length());
        System.out.println(b.length());
        System.out.println(c.length());

//        배열의 길이는 length
//        스트림의 길이는 length(), charAt(), spilt, subString, toCharArray()
//        a. <= 입력하면 위의 함수가 나온다.

        System.out.println("모든 문자열 길이 = "+a.length()+b.length()+c.length());


//        문자 한개씩 배열
//        char[] chars = new char[3];

        String []str = new String[3];
        str[0] = "abcd";
        str[1] = "java";
        str[2] = "system";

        int count = 0;
        for(int i = 0; i< str.length; i++){
            System.out.println(i);
            System.out.println(str[i]);
            System.out.println(str[i].length());
            count = count+str[i].length();
        }
        System.out.println("모든 문자열 길이는 "+count);
    }
}
