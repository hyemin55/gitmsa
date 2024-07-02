package ex04;

public class ex03 {
	
	public static void main(String[] args) {
		
		int num1 = 10;
		
//		num++
//		num = num+1
//		num += 1
//		위 3가지 모두 같은 표현방법.
		
		System.out.println(num1++);
//		num1 출력하고 ++ 증가해서 도출값은 10이 나오고 그 다음엔 +1을 더한 값이 나온다.
		System.out.println(num1);
		System.out.println(++num1);
		
		System.out.println(num1);

		System.out.println(num1--);
//		num1 출력하고 -- 감소해서 도출값은 12가 나오고 그 다음엔 -1을 뺀 값이 나온다.
		System.out.println(num1);
		System.out.println(--num1);
		
		System.out.println(num1);

		for (int i = 0; i <= 10; i++)
			{System.out.println(i);
			System.out.println("GGG");
			System.out.println(i++); //i+=1 or i=i+1
			
			}
		
//		for 조건을 만족할 때 까지 {}안에 들어있는 줄을 반복해준다.
	}
}

/*	디버그 모드(벌레모양)
 * 	브레이크 포인트 -> 원하는 줄의 번호 앞쪽에 더블클릭하여 원기호 나오게 만듬.
 * 	벌레모양으로 실행
 * F6 한줄씩 진행
 * F8 종료
 * */
