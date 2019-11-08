
public class oddnum {
	public static void main(String[] args) {
		// 1부터100까지의 수의 홀수의 합을 구하는 함수를 만드시오

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				sum += i;
		}
		System.out.println("홀수의 합은 : " + sum);
	}
}
