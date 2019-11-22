package day1122;

import java.util.Scanner;

interface IProblem{
	 static void changeDallarToKorea() {
		
	}
}

class dollor implements IProblem{
	 int won;
	 int dallar;
	
	public void changeDallarToKorea() {
		
		dallar = won/1100;
		System.out.println(won+"원은 "+"$"+dallar+"입니다.");
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getDallar() {
		return dallar;
	}

	public void setDallar(int dallar) {
		this.dallar = dallar;
	}
	
	

}

public class dollorTest {

	public static void main(String[] args) {
		dollor i = new dollor();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("원화를 입력하세요");
		int won = scan.nextInt();
		i.setWon(won);
		
		i.changeDallarToKorea();
		

	}

}
