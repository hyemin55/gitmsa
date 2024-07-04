package ex06;

public class exam2 {

	public static void main(String[] args) {
		
//		int a = 0;
		int b = 0;
		int c = 0;
		
		for(int a = 1; a <= 10; a++) {
			System.out.println("b = "+(b = b+a));
			System.out.println("c = "+(c = b+c));
		}
		System.out.println(c);
	}
}
