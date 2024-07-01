package ex03;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {

//	두 수를 입력 받아 곱셈, 나눗셈을 하여 몫과 나머지를 구하시오.
//	콘솔에서 입력받기
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.println("숫자 입력 :");
		a = scan.nextInt(); //결과값에서 입력 받는 구문
		b = scan.nextInt();
		
		System.out.println(a +"*" +b +"=" +a*b);
		System.out.println(a +"/" +b +"=" +a/b);
		System.out.println(a%b);
//		%는 나누고 남은값.
		
	}
}
