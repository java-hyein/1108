package day1113;

import java.util.StringTokenizer;

public class Tokens {
	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("PM:08:45", ":"); // ��ū �� �ֱ�

		while (st1.hasMoreTokens()) // st1�� ��ū���� ������
			System.out.println(st1.nextToken() + ' ');// �������� �����ڸ� �ش�.
		System.out.println();

		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 /2 = 44", "+-=/ ");

		while (st2.hasMoreTokens())
			System.out.println(st2.nextToken() + ' ');
		System.out.println();
	}
}
