package day1111;

import java.util.Scanner;
class ReadAgeException extends Exception{}

public class MyExceptionClass {

	public static void main(String[] args) {
		System.out.println("나이 입력");
		
		try {
			int age = readAge();
			System.out.printf("입력된 나이 : %d\n", age);
		}
		catch(ReadAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	public static int readAge() throws ReadAgeException{
		Scanner kb = new Scanner(System.in);
		int age = kb.nextInt();
		
		if(age < 0)
			throw new ReadAgeException();
		return age;
	}

}
