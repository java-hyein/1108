
class Product {
	static int price;

	Product(int price) {
		this.price = price;
	}

	class TV extends Product {
		TV() {
			super(100);
		}

		public String toString() {
			return "TV";
		}
	}

	class Audio extends Product {
		Audio() {
			super(50);
		}

		public String toString() {
			return "Audio";
		}
	}

	class Airpod extends Product {
		Airpod() {
			super(300);
		}

		public String toString() {
			return "Airpod";
		}
	}
}

class Buyer {
	int money = 200;
	Product[] cart = new Product[3];
	int i = 0;

	void buy(Product p) {

		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		} else {
			money -= p.price;
			add(p);
		}
	}

	void add(Product p) {
		if (cart.length == i) {
			Product[] temp = new Product[cart.length * 2];
			temp[i] = cart[i];
			for (int i = 0; i < cart.length; i++) {
				temp[i] = cart[i];
			}
			cart = temp;
		}
		cart[i++] = p;

	}

	void summary() {
		int temp = 0;
		for (int j = 0; j < i; i++) {
			System.out.print(cart[j].toString() + ",");
		}
		System.out.println("\n 장바구니에 담긴 물건들의 총 가격은 " + temp);
		System.out.println("남은 돈은 " + money);

	}

}