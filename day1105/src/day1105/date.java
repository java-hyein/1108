package day1105;

import java.util.Scanner;

//문제 : 6월 1일이 월요일이라고 상정했을때,
//
//6월 중 하나의 날짜를 입력받아서 그 날짜가 무슨요일인지 출력하세요.
//
//(값이 잘못되었을 경우 - 음수를 입력하거나 35일 이런거 입력했을시 - 프로그램 종료)
public class date {

	public static void main(String[] args) {
		int date;

		Scanner scan = new Scanner(System.in);
		System.out.println("6월 1일이 월요일. 날짜 하나를 입력하세요 : ");
		date = scan.nextInt();

		if (date <= 0 || date > 31) {
			System.out.println("값은 0 이거나 31보다 클 수 없습니다.");
		return;
		}
		switch(date % 7) {
		case (0):
			System.out.printf("6월 %d일은 일요일 입니다.", date);
			break;
		case (1):
			System.out.printf("6월 %d일은 월요일 입니다.", date);
			break;
		case (2):
			System.out.printf("6월 %d일은 화요일 입니다.", date);
			break;
		case (3):
			System.out.printf("6월 %d일은 수요일 입니다.", date);
			break;
		case (4):
			System.out.printf("6월 %d일은 목요일 입니다.", date);
			break;
		case (5):
			System.out.printf("6월 %d일은 금요일 입니다.", date);
			break;
		case (6):
			System.out.printf("6월 %d일은 토요일 입니다.", date);
			break;
		}
	}
}
