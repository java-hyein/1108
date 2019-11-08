
public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 40; i++)
			System.out.format("fibonacci(%d) = %d\n", i, fibonacci(i));
	}
	//��� ȣ�� �̶�? � �Լ��� �ڱ� �ڽ��� �ٽ� ȣ���ϴ� ��
	// ����Լ� ȣ��� �������� ? - ����Լ� ���������� �� �߰��Ѵ�.
	public static int fibonacci(int n) throws IndexOutOfBoundsException {
		if(n < 0)
			throw new IndexOutOfBoundsException(String.format("Out of bounds : %d", n));
		
		if(n == 0|| n == 1)
			return 1;
		return fibonacci(n-2) + fibonacci(n-1);
		/**
		 * switch(n){
		 * case 0;
		 * case 1;
		 * 	return 1;
		 * default:
		 * 	return return fibonacci(n-2) + fibonacci(n-1);
		 */
	}
}


