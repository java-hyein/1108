//interface IRottoNum{
//	int[] randomNum();
//}
//���� �������̽��� �����ϴ� 
//class RottNum�� �ۼ��ϰ� �ζ� ��ȣ�� �����Ͻÿ�.

package day1113;

import java.util.Arrays;
import java.util.Random;

interface IRottoNum {
	int[] randomNum();
}

class RottNum implements IRottoNum {
	int[] lotto;

	@Override
	public int[] randomNum() {
		Random random = new Random();
		lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			// lotto[i] = (int) (Math.random() * 45) + 1; // ���ۿ��� ���� double������ ����Ѵ�.
			lotto[i] = random.nextInt(45) + 1;
			// �ߺ� ���� ---------------------------------------------------
			for (int j = 0; j < i; j++) {//
				if (lotto[i] == lotto[j]) {
					i--;
//					System.out.println("�ߺ��Դϴ�." + i + "==" + j);
					break;
				}
			}
			// -----------------------------------------------------------
		}
		return lotto;
	}

	public void printLottoNum() {
		System.out.println(Arrays.toString(lotto)); // �迭 ���� ��� [ ]
	}

}

public class RottoTest {

	public static void main(String[] args) {
		IRottoNum rottoNum = new RottNum();
		rottoNum.randomNum();
		((RottNum) rottoNum).printLottoNum();
	}

}
