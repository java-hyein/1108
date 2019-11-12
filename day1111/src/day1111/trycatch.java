package day1111;

import java.util.InputMismatchException;
import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.println("a/b....... = a?");
			int n1 = kb.nextInt();
			System.out.println("a/b....=b?");
			int n2 = kb.nextInt();
			System.out.printf("%d /%d = %d", n1, n2, n1 / n2); // 예외발생지
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Good bye~~~~!");
	}

}
