package day1118;

import java.util.Comparator;
import java.util.TreeSet;

class StringComparator implements Comparator<String>{
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>(new StringComparator());
		tree.add("Box");
		tree.add("Robot");
		tree.add("Rabbit");
		
		for(String e : tree)
			System.out.print(e.toString() + '\t');
		System.out.println();
	}

}
