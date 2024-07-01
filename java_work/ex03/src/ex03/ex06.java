package ex03;

public class ex06 {

	public static void main(String[] args) {
//		7/3의 정수형, 실수형 을 나눗셈 해보쟈.
		
		int a = 7;
		int b = 3;
		
		System.out.println(a/b);
//		java는 일반적으로 int계산을 한다.
		System.out.println(a/(double)b);
//		System.out.println(a/b(double)); 결과값 안나옴.
		System.out.println((double)a/b);
		
		
	}
}
