package day1105;

import java.util.Scanner;

//���� : 6�� 1���� �������̶�� ����������,
//
//6�� �� �ϳ��� ��¥�� �Է¹޾Ƽ� �� ��¥�� ������������ ����ϼ���.
//
//(���� �߸��Ǿ��� ��� - ������ �Է��ϰų� 35�� �̷��� �Է������� - ���α׷� ����)
public class date {

	public static void main(String[] args) {
		int date;

		Scanner scan = new Scanner(System.in);
		System.out.println("6�� 1���� ������. ��¥ �ϳ��� �Է��ϼ��� : ");
		date = scan.nextInt();

		if (date <= 0 || date > 31) {
			System.out.println("���� 0 �̰ų� 31���� Ŭ �� �����ϴ�.");
		return;
		}
		switch(date % 7) {
		case (0):
			System.out.printf("6�� %d���� �Ͽ��� �Դϴ�.", date);
			break;
		case (1):
			System.out.printf("6�� %d���� ������ �Դϴ�.", date);
			break;
		case (2):
			System.out.printf("6�� %d���� ȭ���� �Դϴ�.", date);
			break;
		case (3):
			System.out.printf("6�� %d���� ������ �Դϴ�.", date);
			break;
		case (4):
			System.out.printf("6�� %d���� ����� �Դϴ�.", date);
			break;
		case (5):
			System.out.printf("6�� %d���� �ݿ��� �Դϴ�.", date);
			break;
		case (6):
			System.out.printf("6�� %d���� ����� �Դϴ�.", date);
			break;
		}
	}
}
