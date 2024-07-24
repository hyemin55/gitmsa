public class ex05 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("asdf"); //문자열 더하기
        sb.append("asdf");

        System.out.println(sb);

        sb.delete(0,2); // 문자열 0번째에서 2개를 삭제하기.
        System.out.println(sb);

        sb.replace(0,5,"kkk"); // 문자열 0번째에서 5번째를 kkk로 바꾸기.
        System.out.println(sb);

        sb.append("asdf"); //문자열 더하기
        sb.reverse(); //문자열 뒤집기
        System.out.println(sb);
    }
}
