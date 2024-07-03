package ex04;

public class exam2 {

	/*
	 * 아래는 변수 num의 값에 따라 '양수', '음수', '0'을 출력하는 코드이다. 삼항 연산자를 이용해서 (1)에 알맞은 코드를 넣으시오.
	 */
	
	public static void main(String[] args) {
		int num = -10;
		
//		문제풀이
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		System.out.println("num = "+num);
//		System.out.println(num > 0 ? " 양수입니다." : num == 0입니다. ? " 0" : " 음수입니다.");
//		
		
		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else {
			System.out.println("0");
		}
	}
}
