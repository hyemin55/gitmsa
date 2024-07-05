package ex06;

public class ex02 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i += 2) {
			for (int j = 1; j < 8; j++) {
				// j가 4일때 제일 가까이 있는 for구문으로 다시 가라.
				if (j == 4)
					continue;
				System.out.println(i + " * " + j + " = " + i * j);

			}
		}
	}
}