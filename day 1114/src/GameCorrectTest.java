import java.util.InputMismatchException;
import java.util.Scanner;

interface IRandomNum1 {
	void correctNum();
}

class GameCorrect implements IRandomNum1 {

	public void correctNum() {
		int answer = (int) (Math.random() * 100);
		System.out.println("��ǻ�Ͱ� ���� ���� " + answer);

		int input = 0;// ����� �Է�
		int count = 0;// �õ�Ƚ��

		do {
			count++;
			System.out.println("1�� 100������ ���� �Է��ϼ��� : ");
			Scanner scan = new Scanner(System.in);
			try {
				input = scan.nextInt();
			}catch(InputMismatchException e) {
				//e.printStackTrace();
				System.out.println("��ȿ���� ���� ���Դϴ�. �ٽ� �Է��ϼ���");
				continue;
			}

			if (answer > input) {
				System.out.println("�� ū ���� �Է��ϼ���.");
			} else if (answer < input) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else {
				System.out.println("������ϴ�.");
				System.out.println("�õ� Ƚ���� �����ϴ�." + count);
				break;// do-while���� �����.
			}

		} while (true);
	}
}

public class GameCorrectTest {
	public static void main(String[] args) {
		IRandomNum1 game = new GameCorrect();
		game.correctNum();
	}

}
