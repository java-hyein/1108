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
package day1107;

import java.util.Scanner;

class MyMath {
	public static int myMin(int[] arr) {
		int min = arr[0];
		for (int num : arr) {
			if (min > num) {
				min = num;
			}
		}
		return min;
	}

}

public class MyMathTest {

	public static void main(String[] args) {
		int[] arr = new int[5];
		int[] arr2 = { 5, 4, 3, 2, 1 };
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0 ; i<arr.length; i++) {
			arr[i]=scan.nextInt();
		}
		System.out.println(MyMath.myMin(arr));
	}

}
