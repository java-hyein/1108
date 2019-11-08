
public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 0; i < 40; i++)
			System.out.format("fibonacci(%d) = %d\n", i, fibonacci(i));
	}
	//재귀 호출 이란? 어떤 함수가 자기 자신을 다시 호출하는 것
	// 재귀함수 호출시 주의할점 ? - 재귀함수 종료조건을 꼭 추가한다.
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


