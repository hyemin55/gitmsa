package ex03;

public class ex09 {
public static void main(String[] args) {
	
	short num1 = 10;
	
	num1 = (short) (num1 + 87L);
	System.out.println(num1);
	
	num1 = 10;
	num1 +=87L; //띄어쓰기를 하니 에러가 난당. 
	System.out.println(num1);
	
	int num2 = 3;
	
//	복합연산자는 증가외엔 잘 사용하지 않는다.
	num2 = (int) (num2 * 3.3);
	System.out.println(num2);
	num2 *= 3.3;
	System.out.println(num2);
	
}
}
