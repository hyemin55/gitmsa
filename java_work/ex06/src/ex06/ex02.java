package ex06;

public class ex02 {

	public static void main(String[] args) {

		for (int i = 2; i < 10; i += 2) {
			for (int j = 1; j < 8; j++) {
				// j�� 4�϶� ���� ������ �ִ� for�������� �ٽ� ����.
				if (j == 4)
					continue;
				System.out.println(i + " * " + j + " = " + i * j);

			}
		}
	}
}