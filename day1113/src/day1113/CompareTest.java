package day1113;

import java.util.Arrays;


class Person implements Compareable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public int CompareTo(Object o) {
		Person p = (Person) o;
		return this.age - p.age;
	}

	public String toString() {
		return name + ":" + age;
	}

}

public class CompareTest {

	public static void main(String[] args) {
		Person[] ar = new Person[3];
		ar[0] = new Person("Lee", 39);
		ar[1] = new Person("Goo", 15);
		ar[2] = new Person("Soo", 37);

		Arrays.sort(ar);
		for (Person p : ar)
			System.out.println(p);
	}

}
