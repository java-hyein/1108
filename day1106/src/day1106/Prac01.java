package day1106;

import java.util.Scanner;

// ���� ���� 10���� �Է� �޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���
public class Prac01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� 5�� �Է� : ");
		int [] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = scan.nextInt();
		}
		
		System.out.println("3�� ����� : ");
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.println(arr[i]+" ");
			}
		}
		scan.close();
	}

}
