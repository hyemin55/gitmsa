package ex04;

import java.util.Scanner;

public class ex06 {

/*	숫자를 입력받아
 * 	10 미만이면 10 미만 출력
 * 	10 이상이로 20 이하이면 10 이상 20 이하 출력
 * 	20 초과이면 20 초과 출력 
 */
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int num1 = scan.nextInt();
		
		System.out.println(num1);
		
		if(num1<10) {
			System.out.println("10 미만 입니다.");
		}else if(10 <= num1 && num1 <= 20) {
			System.out.println("10 이상이고 20 이하 입니다.");
		} else {
			System.out.println("20 초과");
		}
	}
}
