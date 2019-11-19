//Scanner 클래스를 사용하여 6개 학점 ('A','B','C','D','F')을 문자로 입력 받아  ArrayList에 저장하고, ArrayList를 검색하여
// 학점을 점수 (A=4.0,B=3.0,C=2.0,D=1.0,F=0)로 변환 하여 평균을 출력하는 프로그램을 작성하라.
package day1118;

import java.util.ArrayList;
import java.util.Scanner;

interface Totalable1{
	public abstract void printAVG();
}

class Total implements Totalable1{

	@Override
	public void printAVG() {
		ArrayList<Character> stack = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("6개 학점 입력 : ");
		
		for (int i = 0; i < 6; i++) {
			char c = scan.next().charAt(0);
			stack.add(c);
		}
		
		int sum = 0;
		
		for (int i = 0; i < stack.size(); i++) {
			char c = stack.get(i);
			
			switch (c) {
				case 'A' :
					sum += 4;
					break;
					
				case 'B' :
					sum += 3;
					break;
					
				case 'C' :
					sum += 2;
					break;
					
				case 'D' :
					sum += 1;
					break;
					
				case 'F' :
					sum += 0;
					break;
			}
		}
		
		double avg = (double)sum / stack.size(); 
		System.out.println(avg);
		
		scan.close();
	}
	
}

public class mySelfTest {

	public static void main(String[] args) {
		Totalable1 total = new Total();
		total.printAVG();

	}

}
