package ex03;

public class ex07 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 1;
		
//		a=a+b	a+=b	동일함.
		System.out.println(a);
		a+=b;
		System.out.println(a);
		a+=b;
		System.out.println(a);
//		순서대로 진행되기 때문에 b값을 더해서 계산해준다.
		
		a*=b; //a=a*b
		System.out.println(a);
		
		
		a+=3;
		System.out.println(a);
		
		a+=b;
		System.out.println(a);
		
	}
}
