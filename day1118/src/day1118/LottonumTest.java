//�ζ� ��ȣ 6���� �̾Ƴ��� ���α׷��� �ۼ��Ͻÿ� (�ߺ�����) �ҽ��ڵ� 10�� �̳�
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






















