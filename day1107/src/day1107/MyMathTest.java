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
