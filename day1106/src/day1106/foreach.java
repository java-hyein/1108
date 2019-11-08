package day1106;

public class foreach {

	public static void main(String[] args) {
		int[] ar = { 1, 2, 3, 4, 5 };
		for (int e : ar) {
			System.out.print(e + " ");
		}

		System.out.println();

		int sum = 0;

		for (int e : ar) {
			sum = +e;
		}
		System.out.println("sum = " + sum);

//		int[][] arr = {
//				{11,22,33},
//				{44,55,66},
//				{77,88,99}
//				};

		int[][] arr = { { 11 }, { 22, 33 }, { 44, 55, 66 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
