import java.util.Scanner;
import java.util.Vector;

// Vector �÷����� �̿��Ͽ� �������� ����� ���� �����ϴ� ���α׷��� �ۼ��Ͽ���.
// �������� �Է� �ϸ� ���Ϳ� �߰��ϰ� ���� �Էµ� ��� �������� ����� ����Ѵ�.
public class VectorTest {

	public static void main(String[] args) {

		Vector<Integer> vec = new Vector<>();
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("������ �Է� (0 �Է½� ����) >>");
			int rain = scan.nextInt();
			
			if (rain == 0)
				break;
			
			vec.add(rain);
			
			int avg = 0;
			
			for (int i = 0; i < vec.size(); i++) {
				System.out.print(vec.get(i) + " "); //���Ϳ��ִ°� ��� ����Ʈ���� 
				avg += vec.get(i); //����
			}
			System.out.println();
			
			avg = avg / vec.size();
			System.out.println("���� ��� : " + avg);
				
		}
	}
}
