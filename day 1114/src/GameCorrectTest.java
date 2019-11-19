import java.util.InputMismatchException;
import java.util.Scanner;

interface IRandomNum1 {
	void correctNum();
}

class GameCorrect implements IRandomNum1 {

	public void correctNum() {
		int answer = (int) (Math.random() * 100);
		System.out.println("컴퓨터가 정한 숫자 " + answer);

		int input = 0;// 사용자 입력
		int count = 0;// 시도횟수

		do {
			count++;
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			Scanner scan = new Scanner(System.in);
			try {
				input = scan.nextInt();
			}catch(InputMismatchException e) {
				//e.printStackTrace();
				System.out.println("유효하지 않은 값입니다. 다시 입력하세요");
				continue;
			}

			if (answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 번힙니다." + count);
				break;// do-while문을 벗어난다.
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
