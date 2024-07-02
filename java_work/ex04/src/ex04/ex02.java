package ex04;

public class ex02 {

	public static void main(String[] args) {
		
		int num1 = 5;
		System.out.println(+num1);
		System.out.println(-num1);
		System.out.println(num1);
//		대입하지 않은 num1은 값이 5가 나온다.
		
		System.out.println(num1 = -num1);
		System.out.println(num1);
//		대입한 num1은 -5가 나온다.
	}
}
