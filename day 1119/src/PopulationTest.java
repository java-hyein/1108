import java.util.HashMap;
import java.util.Scanner;

//"�׸�"�� �Էµɶ� ���� �����̸��� �α��� �Է¹޾� �����ϰ�,
//�ٽ� �����̸��� �Է¹޾Ƽ� �α��� ����ϴ� ���α׷��� �ۼ��Ϸ� 
//�ؽø� �̿�

public class PopulationTest {

	public static void main(String[] args) {
		HashMap<String, Integer> pop = new HashMap<>();
		
		String nation;
		int popul = 0;
		Scanner scan = new Scanner(System.in);
		
//�α��� ���� ����
		
		while (true) {
			System.out.print("���� �̸��� �α��� �Է��ϼ��� : ");
			nation = scan.next();
			
			if (nation.equals("�׸�"))
				break;
			popul = scan.nextInt();
			pop.put(nation, popul);
			
		}
		
//�α��˻� 
		
		while (true) {
			System.out.println("�α��˻� : ");
			nation = scan.next();
			
			if (nation.equals("�׸�"))
				break;
			
			Integer n = pop.get(nation);
			
			if (nation == null)
				System.out.println(nation + "�� �α��� �����ϴ�.");
			else 
				System.out.println(nation + "�� �α��� " + n);

		}
		scan.close();
	}
}
