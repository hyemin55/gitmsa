package ex03;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		
//		숫자를 입력받아 두 수의 합을 구하시오.
//		선언만 하면 도출값 에러.
		
		int a;
		int b;
//		무엇인가를 입력 받아서 사용할 때 쓰는 문법 ctrl+space 자동완성!
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자입력");
		
//		a변수에 숫자 입력 받아 넣는 구문
		a = scan.nextInt();
		System.out.println("a =  "+a);

//		결과값에서 a값, b값을 순차적으로 숫자를 입력하면 된다.
		b = scan.nextInt();
		System.out.println("b = "+b);
		
		a = scan.nextInt();
		System.out.println("a =  "+a);

//		결과값에서 a값, b값을 순차적으로 숫자를 입력하면 된다.
		b = scan.nextInt();
		System.out.println("b = "+b);
	}
}
