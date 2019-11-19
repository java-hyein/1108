//로또 번호 6개를 뽑아내는 프로그램을 작성하시오 (중복없이) 소스코드 10줄 이내
package day1118;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LottonumTest {

	public static void main(String[] args) {
		Set<Integer> setLotto = new TreeSet<>();
		while(setLotto.size() < 6){
			 setLotto.add((int)(Math.random() * 45) + 1);
		}
		System.out.println("LottoNum : "+ setLotto);
	}
}






















