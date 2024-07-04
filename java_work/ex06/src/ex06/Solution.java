package ex06;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
//	        nextInt는 Int를 입력받는다.
		String age_type = sc.next();
//	        next는 String을 입력받는다.
		int answer = 0;

//	        a == 10 <=숫자 비교
//	        a.equals("10") <=문자열 비교
		if (age_type.equals("KOREA")) {
			answer = 2030 - year +1;
			
		} else if (age_type.equals("Year")) {
			answer = 2030 - year ;
		}

		System.out.println("age+type = " + age_type);
		System.out.println("answer = " + answer);
		System.out.println("year = " + year);
	}
}
