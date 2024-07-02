package ex04;

public class ex07 {

//	삼항연산자
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
//		String result = a > b ? "a는 b보다 큽니다." : "a는 b보다 작습니다.";
//		if else 구문과 비슷하다.

//		System.out.println(result);

		String result = "";
		if (a > b) {
		result = "a는 b보다 큽니다.";		
		} else {
			result = "a는 b보다 작습니다.";
		}
		
		System.out.println(result);
	}
}
