import java.util.Scanner;

interface IRandomNum {
	void correctNum();
}

public class correctNum1 implements IRandomNum {
	int randomvalue;
	int count = 0;
	int userNum;

	public void correctNum() {
		randomvalue = (int) (Math.random() * 100 + 1);

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("1���� 100������ ���� �Է��ϼ��� : ");
			userNum = scan.nextInt();
			for (int i = 0; i < randomvalue; i++) {
				if (userNum < randomvalue) {
					System.out.println("�� ū���� �Է��ϼ���");
					userNum = scan.nextInt();
					count++;
				} else if (userNum > randomvalue) {
					System.out.println("�� ���� ���� �Է��ϼ���");
					userNum = scan.nextInt();
					count++;
				} 
			}
			System.out.println("���߾����ϴ�.");
			System.out.println("�õ� Ƚ���� " + count + "�� �Դϴ�.");
		} catch (Exception e) {
			System.out.println("��ȿ���� ���� ���Դϴ�.�ٽ� ���� �Է����ּ���");
			System.out.println( );
			correctNum();
		}
		scan.close();
	}
}
