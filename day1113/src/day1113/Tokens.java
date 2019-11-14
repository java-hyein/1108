package day1113;

import java.util.StringTokenizer;

public class Tokens {
	public static void main(String[] args) {
		StringTokenizer st1 = new StringTokenizer("PM:08:45", ":"); // 토큰 값 주기

		while (st1.hasMoreTokens()) // st1에 토큰값이 있으면
			System.out.println(st1.nextToken() + ' ');// 공백으로 구분자를 준다.
		System.out.println();

		StringTokenizer st2 = new StringTokenizer("12 + 36 - 8 /2 = 44", "+-=/ ");

		while (st2.hasMoreTokens())
			System.out.println(st2.nextToken() + ' ');
		System.out.println();
	}
}
