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
		System.out.print("1�� ������ ������ : ");
		
		for(int i = 0; i< paper.length; i++) {
			paper[i] = rand.nextInt(3)+1;
			if(paper[i] == 1) {
				System.out.println("����");
			}else if(paper[i] == 2) {
				System.out.println("����");
			}else {
			System.out.println("��");	
			}
		}
		return paper;
	}

}
