
public class oddnum {
	public static void main(String[] args) {
		// 1����100������ ���� Ȧ���� ���� ���ϴ� �Լ��� ����ÿ�

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				sum += i;
		}
		System.out.println("Ȧ���� ���� : " + sum);
	}
}
