package ex05;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {

//		계속 입력받아 진행
		Scanner scan = new Scanner(System.in);

		while (true) {

			int num = scan.nextInt();
			System.out.println("num = " + num);

			if (num == 0) {
				break;
//		조건에 부합했을 때 break;가 발동되어 while 구문을 빠져나가 종료된다.
			}
		}
		System.out.println("종료됩니다.");
	}
}
