//1. 학생 정보 입력 기능: 사용자로부터 학생의 이름, 학번, 국어 점수, 영어 점수, 수학 점수를 입력받아 객체로 저장합니다.
//2. 학생 정보 출력 기능: 저장된 모든 학생의 정보(이름, 학번, 국어 점수, 영어 점수, 수학 점수)를 출력합니다.
//3. 성적 평균 계산 기능: 각 학생의 국어, 영어, 수학 점수 평균을 계산하여 출력합니다.
//4. 성적순 정렬 기능: 학생들을 평균 점수가 높은 순서대로 정렬하여 출력합니다.
//5. 특정 학번 검색 기능: 학번을 입력받아 해당 학생의 정보(이름, 학번, 국어 점수, 영어 점수, 수학 점수)를 출력합니다.
//6. 프로그램 종료 기능: 사용자가 원할 때 프로그램을 종료할 수 있어야 합니다.

package org.example;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Students[] a = new Students[3];
        for ( int i =0; i<=2; i++){
            System.out.println("이름을 입력해 주세요.");
            String name = scan.next();

            System.out.println("학번을 입력해 주세요.");
            int studentID = scan.nextInt();
            for(int j=0; j<i; j++){
                if(studentID==a[j].studentID){
                    System.out.println("중복된 학번 입니다.");
                }
            }

            System.out.println("국어점수를 입력해 주세요.");
            int korean = scan.nextInt();

            System.out.println("영어점수를 입력해 주세요.");
            int english = scan.nextInt();

            System.out.println("수학점수를 입력해 주세요.");
            int math = scan.nextInt();

            a[i] = new Students(name, studentID, korean, english, math);
            a[i].result();

            System.out.println();
            System.out.println((i+1)+"명의 학생 정보가 입력 되었습니다.");
            System.out.println();
        }

//        a[1] = {name, studentID, korean, english, math}
//        a[2] = {name, studentID, korean, english, math}
//        a[3] = {name, studentID, korean, english, math}



//  null과는 비교가 안된다.
//  break는 가장 가까운 for구문으로 탈출한다.

    }
}