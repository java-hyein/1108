package day1106;

import java.util.Scanner;

//������ Ŭ���� �Լ��� ����ÿ�.
//Ŭ���� ���� MyMath �̸� �Ʒ��� �� �Լ��� static ���� ����ÿ�.
//
//�Լ���: myMin
//�Ķ����: int �迭
//���ϰ� �迭�� ���� �ּҰ�
//
//�Լ���: myMax
//�Ķ����: int �迭
//���ϰ� �迭�� ���� �ּҰ�
//
//�׽�Ʈ Ŭ���� MyMathTest �� ������ int �迭 5���� Ű���� �Է����� ������ myMin, myMax �Լ� ȣ���Ұ�.

class MyMath {
	int num ;

	public static int myMin(int[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num > arr[i])
				num = arr[i];
		}
		// System.out.println("�ּڰ� : " + num);
		return num;
	}

	public static int myMax(int[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num < arr[i])
				num = arr[i];
		}
		// System.out.println("�ִ밪 : "+ num);
		return num;
	}
}

public class MyMathTest {

	public static void main(String[] args) {
		int num = 1;
		int[] array = new int[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("���� 5���� �Է��ϼ��� >> ");
		num = scan.nextInt();
		
		for (int i = 0; i < array.length; i++) 

			array[i] = num;
		

		System.out.println("�ּҰ� : " + MyMath.myMin(array));
		System.out.println("�ִ� : " + MyMath.myMax(array));

	}

}
