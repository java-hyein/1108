package day1113;

import java.util.Arrays;
import java.util.Random;

interface Rock1{
	int [] rsp1();
}
public class RSP2 implements Rock1{
	int [] paper1;
	
	public int[] rsp1() {
		Random rand = new Random();
		paper1 = new int[1];
		System.out.print("2�� ������ ������ : ");
		
		for(int j = 0; j< paper1.length; j++) {
			paper1[j] = rand.nextInt(3)+1;
			if(paper1[j] == 1) {
				System.out.println("����");
			}else if(paper1[j] == 2) {
				System.out.println("����");
			}else {
			System.out.println("��");	
			}
		}
		return paper1;
	}

}
