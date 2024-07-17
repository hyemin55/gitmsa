/*
1. "Hello.java" 문자열에서 파일명은 Hello와 확장자인 java를 분리시켜보자.

    입력 >>Hello.java
    출력
    파일명 Hello
    확장자 java
 */
//파일 업로드 시에 .exe 파일을 올릴 수 없도록 검사할 때 자주 사용한다.
//        if(temp[0].equals("exe"))
//            return;

public class exam1 {
    public static void main(String[] args) {
        String str = "Hello.java";
        String temp[] = str.split("\\.");
        System.out.println(temp[0]);
        System.out.println(temp[1]);

    }
}
