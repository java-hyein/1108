
public class number {
	public static void main(String[] args) {
		
//		         1���� 100������ ��                             
		
//		int sum = 0;
//		for(int j = 0; j <= 100; j++) {
//			sum += j;
//		}
//		System.out.println(sum + "\n");
		
//		1���� 100���� �߿� 3�� ���
		
//		for (int i = 0; i <= 100; i++) {
//			if(i % 3 == 0 )
//			System.out.println(i);
//		}
////1���� 100������ Ȧ���� ��
//		int odd = 0;
//		for (int i = 1; i <= 100; i++) {
//			if(i % 2 == 1) { // Ȧ�� ����
//				odd += i;
//			}
//		}
//		System.out.println(odd + "\n");
//		
////������ 7���� ����Ͻÿ�
//		
//		int seven = 7;
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(seven + " * " + i + " = " + (seven*i));
//		}
//		
//		int num = 1;
//		boolean search = false;
//		
//		while(num < 100) {
//			if((num % 5 == 0) && (num % 7 == 0)) {
//				search = true;
//				break;
//			}
//			num++;
//		}
//		if(search)
//			System.out.println("ã�� ���� : " + num);
//		else
//			System.out.println("5�� ������� 7�� ����� ���� ã�� ���߽��ϴ�.");
//
//		int num = 1;
//		boolean search = true;
//
//		while (num < 100) {
//			if ((num % 5 == 0) && (num % 7 == 0)) {
//				break;
//			}
//			num++;
//		}
//		if (search)
//			System.out.println("ã�� ���� : " + num);
//		else
//			System.out.println("5�� ������� 7�� ����� ���� ã�� ���߽��ϴ�.");
//
		int num = 0;
		int count = 0;
		while((num++) < 100) {
			if((num % 5 != 0) || (num % 7 != 0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count : " + count);
	}

}
