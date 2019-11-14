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
			System.out.println("1부터 100사이의 값을 입력하세요 : ");
			userNum = scan.nextInt();
			for (int i = 0; i < randomvalue; i++) {
				if (userNum < randomvalue) {
					System.out.println("더 큰수를 입력하세요");
					userNum = scan.nextInt();
					count++;
				} else if (userNum > randomvalue) {
					System.out.println("더 작은 수를 입력하세요");
					userNum = scan.nextInt();
					count++;
				} 
			}
			System.out.println("맞추었습니다.");
			System.out.println("시도 횟수는 " + count + "번 입니다.");
		} catch (Exception e) {
			System.out.println("유효하지 않은 값입니다.다시 값을 입력해주세요");
			System.out.println( );
			correctNum();
		}
		scan.close();
	}
}
