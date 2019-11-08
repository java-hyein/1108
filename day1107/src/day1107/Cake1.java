package day1107;

class Cake {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}

class CheeseCake extends Cake {
	public void yummy() {
		System.out.println("Yummy CheeseCake");
	}
}

public class Cake1 {
	public static void main(String[] args) {
		Cake c1 = new CheeseCake();
		CheeseCake c2 = new CheeseCake();

		c1.yummy();
		c2.yummy();
	}

}
