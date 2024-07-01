package ex03;

public class ex05 {

	public static void main(String[] args) {
		
//		ctrl + 1 빠른 에러처리
		double a = 10.345;
		int b = (int) a;
//		a라는 변수를 b에 넣고 싶을 때 
//		int보다 double이 더 크기때문에 자료손실이 일어나 형변환이 필요하다.
//		int = 4byte	double = 8byte
		
		System.out.println(a);
		System.out.println(b);

		
		a = 11.39;
//		double a = 11.39;로 인식된다.
//		한 파일안에서 두개의 변수값을 입력할 수 없다.
//		ex) double a=10.345;
//			double a=11.39;
//			결과값 도출X.
		
		b = (int) a;
		System.out.println(a);
		System.out.println(b);
		
		
	}
}
