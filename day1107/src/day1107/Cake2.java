package day1107;

public class Cake2 {
	public void yummy() {
		System.out.println("Yummy Cake");
	}
}
class CheeseCake2 extends Cake2 {
	public void yummy() {
		super.yummy();
		System.out.println("Yummy Cheese Cake");
	}

	public void tasty() {
		super.yummy();
		System.out.println("Yummu Tasty Cake");
	}
}
