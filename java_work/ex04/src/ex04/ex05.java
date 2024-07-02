package ex04;

public class ex05 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		if (a > b) {
			System.out.println("true 실행");
		} else {
			System.out.println("많이 출력");
			System.out.println("false 실행");

			int c = 30;
			System.out.println(c);
//			c조건은 else{ 안의 변수조건 넣은 이후부터 } 안에서 조건이 발동된다.
		}
//		{} 중요! 잘 넣쟈.
	}
}
