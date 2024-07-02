package ex04;

public class exam3 {

/*
 * 아래는 변수 num의 값 중에서 백의 자리 이하를 버리는 코드이다. 만일 변수 num의 값이 456 이라면 400이 되고 111 이라면
 * 100이 된다. (1)에 알맞은 코드를 넣으시오.
 */
	public static void main(String[] args) {
		int num = 456;
		
		double num2 = (double)+num/100;
		
		System.out.println((int)num2*100);
	}
}