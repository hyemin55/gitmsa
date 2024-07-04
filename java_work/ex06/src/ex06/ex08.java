package ex06;

import java.util.Scanner;

public class ex08 {

//	int가 있으면 return을 입력.
	public static int doA(int num) {
		return num * num;
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("곱하고 싶은 값 입력");
			int input = scan.nextInt();
			System.out.println(doA(input));
		}
	}
}
