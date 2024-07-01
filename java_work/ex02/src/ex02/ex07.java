package ex02;

public class ex07 {

	public static void main(String[] args) {
		final int MAX_SIZE = 100;
		//final이 들어가면 정의값이 변하지 않는다.
		System.out.println(MAX_SIZE);
		
		final double AA = 200;
		System.out.println(AA);
		
		final String c = "변경불가";
				System.out.println(c);
		
		float result = (float) (3.3 + 4.5);
		//float result = (float)<-강제 변환하여 계산가능 (3.3 + 4.5);
		System.out.println(result);
		
		System.out.printf("정수는 %d 실수는 %f" ,10,20.33);
		//printf로 바꿔준다.(결과값에 줄바꿈이 없다.)
		//%d에는 정수를, %f에는 실수를 넣어준다.
		
		
		System.out.println(455623121234564564L);
		//L이 뭐라구우!?
		
		System.out.println(3.4*1000000000);
		//결과값이 3.4E9로 표현된다.
	}
}
