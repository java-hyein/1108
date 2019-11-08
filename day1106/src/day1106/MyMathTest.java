package day1106;

import java.util.Scanner;

//다음의 클래스 함수를 만드시오.
//클래스 명은 MyMath 이며 아래의 두 함수를 static 으로 만드시오.
//
//함수명: myMin
//파라미터: int 배열
//리턴값 배열의 값중 최소값
//
//함수명: myMax
//파라미터: int 배열
//리턴값 배열의 값중 최소값
//
//테스트 클래스 MyMathTest 를 만든후 int 배열 5개를 키보드 입력으로 받은후 myMin, myMax 함수 호출할것.

class MyMath {
	int num ;

	public static int myMin(int[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num > arr[i])
				num = arr[i];
		}
		// System.out.println("최솟값 : " + num);
		return num;
	}

	public static int myMax(int[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (num < arr[i])
				num = arr[i];
		}
		// System.out.println("최대값 : "+ num);
		return num;
	}
}

public class MyMathTest {

	public static void main(String[] args) {
		int num = 1;
		int[] array = new int[5];

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자 5개를 입력하세요 >> ");
		num = scan.nextInt();
		
		for (int i = 0; i < array.length; i++) 

			array[i] = num;
		

		System.out.println("최소값 : " + MyMath.myMin(array));
		System.out.println("최댓값 : " + MyMath.myMax(array));

	}

}
