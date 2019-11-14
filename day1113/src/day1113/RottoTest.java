//interface IRottoNum{
//	int[] randomNum();
//}
//위의 인터페이스를 구현하는 
//class RottNum을 작성하고 로또 번호를 추출하시오.

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
			// lotto[i] = (int) (Math.random() * 45) + 1; // 무작우의 숫자 double형으로 출력한다.
			lotto[i] = random.nextInt(45) + 1;
			// 중복 제거 ---------------------------------------------------
			for (int j = 0; j < i; j++) {//
				if (lotto[i] == lotto[j]) {
					i--;
//					System.out.println("중복입니다." + i + "==" + j);
					break;
				}
			}
			// -----------------------------------------------------------
		}
		return lotto;
	}

	public void printLottoNum() {
		System.out.println(Arrays.toString(lotto)); // 배열 내용 출력 [ ]
	}

}

public class RottoTest {

	public static void main(String[] args) {
		IRottoNum rottoNum = new RottNum();
		rottoNum.randomNum();
		((RottNum) rottoNum).printLottoNum();
	}

}
