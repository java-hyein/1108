import java.util.ArrayList;
import java.util.List;

public class arrayliste {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); // �÷��� �ν��Ͻ� ����

		list.add("Toy");
		list.add("Box");
		list.add("Robot");

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();

		list.remove(0);// ù��° �ν��Ͻ� ����

		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + '\t');
		System.out.println();
	}

}
