package day1113;

import java.util.Arrays;
import java.util.Random;

interface Rock{
	int [] rsp();
}
public class RSP implements Rock{
	int [] paper;
	
	public int[] rsp() {
		Random rand = new Random();
		paper = new int[1];
		System.out.print("1번 유저의 선택은 : ");
		
		for(int i = 0; i< paper.length; i++) {
			paper[i] = rand.nextInt(3)+1;
			if(paper[i] == 1) {
				System.out.println("가위");
			}else if(paper[i] == 2) {
				System.out.println("바위");
			}else {
			System.out.println("보");	
			}
		}
		return paper;
	}

}
