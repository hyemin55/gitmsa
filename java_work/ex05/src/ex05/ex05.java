package ex05;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = 0;
		
		while(true) {
			
			n++;
			System.out.println("n="+n);
			if(n==3)
				continue;
//			continue는 조건에 부합하면 다음으로 진행 하지않고 조건 검사로 이동한다.
			
			int temp = scan.nextInt();
			System.out.println("temp = "+temp);
		}
		
//		System.out.println("종료됩니다.");
	}
}
