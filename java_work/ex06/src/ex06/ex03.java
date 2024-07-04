package ex06;

public class ex03 {
	private static void hieveryone(int i) {
		System.out.println("여기온다");

		if (i == 12) {
			System.out.println("i = 12입니다");
		}
		
	}

	public static void main(String[] args) {

		System.out.println("===프로그램 시작===");
		hieveryone(12);
		hieveryone(13);
		System.out.println("===프로그램 끝===");

	}
}
