/*
Shift + F10 현재 설정된 파일 실행
Ctrl + Shift + F10 열려진 파일 실행
Ctrl + Alt + L 자동정렬
Alt+1 프로젝트 경로 목록
Esc 소스파일에 커서
Alt+insert 파일생성
 */

public class Main {
    public static void main(String[] args) {
       System.out.printf("Hello and welcome!");

       /*
       1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10)의 결과를 계산하시오.
        */

        int sum = 0;

        for (int i = 0; i < 11; i++) {

            for (int j = 1; j < i+1; j++) {
                System.out.println("j = "+j);
                sum = sum+j;

            }
            System.out.println("sum = "+sum);
        }
        System.out.println("sum = "+sum);
    }
}