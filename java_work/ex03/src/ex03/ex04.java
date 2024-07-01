package ex03;

//열혈강의 03
public class ex04 {

	public static void main(String[] args) {
		
//		강제 형변환 필요.
//		int 4byte	short 2byte
//		8bit -> 1byte
		int num1 = 10;
		short num2 = (short) num1;

		
		
		
//		short 32000 -> 데이터 소실이 일어날 때 강제로 변환해 주는 방법
//		(저장소 공간에따라 필요하다. 작은곳->큰곳은 필요없음, 큰곳->작은곳 필요.)
		System.out.println(num2);
		
//		자동 형변환.
		short num3 = 20;
		int num4 = num3;
		System.out.println(num4);
		
		
	}
	
}
