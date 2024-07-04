package ex06;

public class exam3 {

	public static void main(String[] args) {

		int a = 1;
		int b = 0;
		int i = 0;
		
		while(i <= 100) {
			a = a+2;
			
			b = b-2;
			i = a+b;
			System.out.println(i);
		}
	}
}
