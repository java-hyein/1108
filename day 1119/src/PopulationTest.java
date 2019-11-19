import java.util.HashMap;
import java.util.Scanner;

//"그만"이 입력될때 까지 나라이름과 인구를 입력받아 저장하고,
//다시 나라이름을 입력받아서 인구를 출력하는 프로그램을 작성하러 
//해시맵 이용

public class PopulationTest {

	public static void main(String[] args) {
		HashMap<String, Integer> pop = new HashMap<>();
		
		String nation;
		int popul = 0;
		Scanner scan = new Scanner(System.in);
		
//인구와 나라 저장
		
		while (true) {
			System.out.print("나라 이름과 인구를 입력하세요 : ");
			nation = scan.next();
			
			if (nation.equals("그만"))
				break;
			popul = scan.nextInt();
			pop.put(nation, popul);
			
		}
		
//인구검색 
		
		while (true) {
			System.out.println("인구검색 : ");
			nation = scan.next();
			
			if (nation.equals("그만"))
				break;
			
			Integer n = pop.get(nation);
			
			if (nation == null)
				System.out.println(nation + "의 인구는 없습니다.");
			else 
				System.out.println(nation + "의 인구는 " + n);

		}
		scan.close();
	}
}
