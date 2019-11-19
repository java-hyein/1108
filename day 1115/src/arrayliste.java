import java.util.ArrayList;
import java.util.List;

public class arrayliste {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // 컬랙션 인스턴스 생성

		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();

		list.remove(0);// 첫번째 인스턴스 삭제

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}

}
