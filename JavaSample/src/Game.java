//369���� ¥��
// � ���� 369��� ���ڸ� ������  ������ ����.
// int find369(int number);
// �ڸ����� �˼� ���� ū ���ڿ� ���� �ϳ��ϳ��� �ٷ궧 �˾ƾ��ϴ� �ڵ�
public class Game {
	public static int find369(int number) {// ���� �޾ƿ��� ���� - �Ʒ� i�� ���� int number�� ����
		int count = 0;
		while (number > 0) {  // 0���� ���� ���� ���� ���� �ִ�
			int temp = number % 10;  //���� 1�� �ڸ��� ���ڰ� 3,6,9 ���� Ȯ�� ���ڸ��� �и�
			if(temp == 3 || temp == 6 || temp == 9)
				count++;
				number /=10; //���ڸ��� ���δ�(100,1000,10000�� ������ �𸣴ϱ�) ������ ������ 
		}
		return count;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) { 
			int count = find369(i);
				System.out.format("%d :", i);
			for(int j = 0; j < count; j++) {
				System.out.print("¦");
			}
			System.out.println(" ");
		}
	}

	
//	public static void main(String[] args) {
//		
//		//int find369;
//			for(Integer i = 1; i <= 100; i++) {
//				if(i.toString().indexOf('3') < 0)
//				if(i.toString().indexOf('6') < 0)
//				if(i.toString().indexOf('9') < 0)
//					continue;
//				System.out.format("%d\n", i);
//				
//			}
//	}
}
