import java.util.Scanner;

public class TestMinMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� 5���� ��������: ");
		double[] arr = new double[5];
		// double[] arr = { 11.0, 240.0, 381.54, 4.1, 57.5 };

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextDouble();
		}
		System.out.println("�ּ� : " + Min.minn(arr));
		System.out.println("�ִ� : " + Max.maxx(arr));
	}

}
