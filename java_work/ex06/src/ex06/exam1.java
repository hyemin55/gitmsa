package ex06;

public class exam1 {

	/*
	 * 1. 1부터 20까지의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오. 2.
	 * 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+4+...+10)의 결과를 계산하시오.
	 * 1+(-2)+3+(-4)+...과같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오. 4. for 문을
	 * shile 문으로 변경하시오. 위의 문제를 함수호출로 변경하세요.
	 */
	public static void main(String[] args) {
		int a = 0;
		int i = a;
		
		for ( a = 1 ; a <= 20; a++) {
			if (a % 2 == 0 || a % 3 == 0) {	
				continue;
			}
			System.out.println(a);
			i= i+a;
		}
	
		System.out.println(i);
		
		}
	}
