package day1106;

import java.util.Scanner;

// 양의 정수 10개를 입력 받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력해보자
public class Prac01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("양의 정수 5개 입력 : ");
		int [] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++){
			arr[i] = scan.nextInt();
		}
		
		System.out.println("3의 배수는 : ");
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] % 3 == 0) {
				System.out.println(arr[i]+" ");
			}
		}
		scan.close();
	}

}
