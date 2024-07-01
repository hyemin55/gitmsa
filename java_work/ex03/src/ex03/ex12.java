package ex03;

public class ex12 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		
		boolean result;
		result = ((a+=10)<0) && ((b+=10)>0);
//		and 연산자를 사용할 때 
//		앞의 값을 먼저 계산 후 false가 나오면 뒷부분은 계산하지 않는다.
//		그래서 a값은 10을 더해주고
//		b값은 더하지 않고 10이 나온다.
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
		
		
		result = ((a+=10)<0) || ((b+=10)>0);
//		or 연산자를 사용할 때
//		앞의 값이 틀려도 한가지만 맞으면 true가 되기 때문에 뒷부분까지 계산해준다.
//		그래서 a값은 위의 계산값인 a=20을 대입하여 30이 나오고
//		b값은 연산 시 true에 해당되어 10을 더해 20이 나온다. 
		System.out.println(result);
		System.out.println(a);
		System.out.println(b);
	}
}
