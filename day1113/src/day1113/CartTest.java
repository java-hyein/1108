package day1113;

public class CartTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new TV());
		b.buy(new Computer());
		b.buy(new TV());
		b.summary();

	}

}
