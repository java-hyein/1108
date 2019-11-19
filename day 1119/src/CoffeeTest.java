import java.util.HashMap;
import java.util.Scanner;

//HashMap<String, Integer> �÷����� �����ϰ� �����������ҡ��� 2000, 
//���Ƹ޸�ī�롱�� 2500, ��īǪġ�롱�� 3000, ��ī����ס��� 3500�� �����϶�.
//�׸��� ������ ���� ����� �̸��� �Է¹����� HashMap���� �˻��Ͽ� ������ ����϶�.
//===================
//����������, �Ƹ޸�ī��, īǪġ��, ī��󶼰� �ֽ��ϴ�.
//�ֹ�>> �Ƹ޸�ī��
//�Ƹ޸�ī��� 2500�� �Դϴ�.
//�ֹ�>> īǪġ��
//īǪġ��� 3000�� �Դϴ�.
//�ֹ�>> �׸�
public class CoffeeTest {

	public static void main(String[] args) {
		HashMap<String, Integer> coffee = new HashMap<>();

		coffee.put("����������", 2000);
		coffee.put("�Ƹ޸�ī��", 2500);
		coffee.put("īǪġ��", 3000);
		coffee.put("ī�����", 3500);

		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("����������, �Ƹ޸�ī��, īǪġ��, ī��󶼰� �ֽ��ϴ�.");
			System.out.println("�ֹ� >> ");
			String chioce = scan.next();

			if (chioce.equals("�׸�"))
				break;
			
			Integer n = coffee.get(chioce);

			System.out.println(chioce + "�� " + n + "�Դϴ�");
			
		}

	}

}
