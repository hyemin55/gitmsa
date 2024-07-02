package ex04;

public class ex01 {
	public static void main(String[] args) {

		int a = 10;
		int b = 3;
		boolean result = 10 % 3 == 0 || (a += 10) > 0;
//		boolean은 참 또는 거짓을 알려준다.
//		result 외 다른 문자를 입력해도 무방하다.

		System.out.println(result);
		System.out.println(a);
		

	}
}

/*	home 그 줄에서 제일 앞으로
*	end 그 줄에서 제일 뒤로
*	shift 블럭지정
*	crtl+D 블럭지정한 줄 삭제
*/