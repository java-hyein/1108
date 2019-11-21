package day1121;

import java.util.HashMap;
import java.util.Scanner;

public class Location {

	public static void main(String[] args) {
		HashMap<String,Location> city = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
		System.out.println("도시,경도,위도를 입력하세요");
		System.out.println(">>");
		String next = scan.nextLine();
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(next.equals("그만"))
			break;
		
		
		//System.out.println(next+" "+ a +" " + b);
		
		}
	}

}
