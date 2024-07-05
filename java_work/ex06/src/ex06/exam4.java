package ex06;

public class exam4 {
	
	public static void main(String[] args) {
		
		int i = 0;

		
		while (i < 10) {
			 i++;
			 int j = 1;
			while (j <= i) {
				j++;
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
//* 4. for 문을 while 문으로 변경하시오. 