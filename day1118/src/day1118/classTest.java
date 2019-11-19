//Scanner Ŭ������ ����Ͽ� 6�� ���� ('A','B','C','D','F')�� ���ڷ� �Է� �޾�  ArrayList�� �����ϰ�, ArrayList�� �˻��Ͽ�
// ������ ���� (A=4.0,B=3.0,C=2.0,D=1.0,F=0)�� ��ȯ �Ͽ� ����� ����ϴ� ���α׷��� �ۼ��϶�.
package day1118;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Totalable {
	public abstract void printAVG();
}

class TotalAVG implements Totalable {

	@Override
	public void printAVG() {
		ArrayList<Character> stack = new ArrayList<>();

		Scanner scan = new Scanner(System.in);
		System.out.println("6���� ���� �Է� : ");

		for (int i = 0; i < 6; i++) {
			char c = scan.next().charAt(0);
			stack.add(c);
		}
		// ���� ���
		int sum = 0;
		for (int i = 0; i < stack.size(); i++) {
			char c = stack.get(i); // ��ü �޾Ƴ��� �κ�
			switch (c) {
			case 'A':
				sum += 4;
				break;
			case 'B':
				sum += 3;
				break;
			case 'C':
				sum += 2;
				break;
			case 'D':
				sum += 1;
				break;
			case 'F':
				sum += 0;
				break;
			}
		}

		double avr = (double) sum / stack.size();
		System.out.println("��� : " + avr);

		scan.close();
	}

}

public class classTest {

	public static void main(String[] args) {
		Totalable total = new TotalAVG();
		total.printAVG();

	}
}
