package day1118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Iterator {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);

		ListIterator<String> litr = list.listIterator();

		String str;

		while (litr.hasNext()) {
			str = litr.next();
			System.out.print(str + '\t');
			if (str.equals("Toy"))
				litr.add("Toy2");
		}
		System.out.println();

		while (litr.hasPrevious()) {
			str = litr.previous();
			System.out.print(str + '\t');
			if (str.equals("Robot"))
				litr.add("Robot2");
		}
	}

}
