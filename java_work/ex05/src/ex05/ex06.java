package ex05;

public class ex06 {

	public static void main(String[] args) {
		
//		3, 4의 최소공배수
//		3과 4로 나누었을때 중복으로 0으로 떨어지는 값.
		
//		break는 swith 또는 while for 구문을 탈출한다.
//		continue는 다시 조건검사로 이동한다.
				
		for (int num = 1; num < 100; num++) {
			
			if(num % 3==0 && num % 4==0 ) {
			System.out.println("num="+num);
			break;
		}
		}
	}
}
