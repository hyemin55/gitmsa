package ex03;

public class ex11 {

	public static void main(String[] args) {
		
		int num1 = 11;
		int num2 = 22;
		
		boolean result;
		
		result = 3 <= num1 && num1 <= 100;
		System.out.println(result);
		
		result = num1%3==0;
		System.out.println(result);
		
		result = num1%2==0;
		System.out.println(result);
		
//		()를 넣어주면 보기가 좋다.
//		무조건 ()가 먼저이기 때문에 잘못 입력하면 값이 바뀔 수 있다.
		result = (num1 % 3 == 0) && (num1 % 2 == 0);
		System.out.println(result);
		
//		앞의 and(&&)를 계산 후 or(||) 계산.
		result = (num1 % 3 == 0) && (num1 % 2 == 0) || num2 % 2 == 0;
		System.out.println(result);
	}
}
