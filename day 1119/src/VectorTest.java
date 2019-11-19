import java.util.Scanner;
import java.util.Vector;

// Vector 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하여라.
// 강수량을 입력 하면 벡터에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
public class VectorTest {

	public static void main(String[] args) {

		Vector<Integer> vec = new Vector<>();
		
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.println("강수량 입력 (0 입력시 종료) >>");
			int rain = scan.nextInt();
			
			if (rain == 0)
				break;
			
			vec.add(rain);
			
			int avg = 0;
			
			for (int i = 0; i < vec.size(); i++) {
				System.out.print(vec.get(i) + " "); //벡터에있는걸 모두 프린트해줌 
				avg += vec.get(i); //총점
			}
			System.out.println();
			
			avg = avg / vec.size();
			System.out.println("현재 평균 : " + avg);
				
		}
	}
}
