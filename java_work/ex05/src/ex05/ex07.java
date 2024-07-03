package ex05;

public class ex07 {

	public static void main(String[] args) {
		
//		while에서 num을 1씩 증가한 후 if에서 5로 나눈값이 0이 아니면 
//		continue;때문에 다시 조건검사로 이동하는걸 반복하고
//		if에서 5로 나눈값이 0에 부합하면 다음줄로 넘어가 출력이 된다.
		
		int num = 0;
		while((num++)<100) {
			if(num%5 != 0)
				continue;
			System.out.println("num = "+num);
		}
		
	}
}
