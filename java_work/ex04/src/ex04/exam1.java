package ex04;

/*
 * �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����)�� ���� ���ϴ� �ڵ��̴�.
 * ���� ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�
 * 13���� �ٱ��ϰ� �ʿ��� ���̴�.
 * (1)�� �˸��� �ڵ带 �����ÿ�.
 */
public class exam1 {

	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = (numOfApples / sizeOfBucket);
		int a = numOfApples % sizeOfBucket;

		int result = a > 0 ? (numOfBucket + 1) : numOfBucket;
		System.out.println("�ʿ��� �ٱ����� �� = " + result);
	}
}
