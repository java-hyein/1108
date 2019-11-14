package day1113;

public class Product {
	int price;

	Product(int price) {
		this.price = price;
	}

}

class TV extends Product {
	TV() {
		super(100);
	}

	public String toString() {
		return "TV";
	}
}

class Computer extends Product {
	Computer() {
		super(100);
	}

	public String toString() {
		return "Computer";
	}
}

class Buyer { // 소비자
	int money = 1000;
	Product[] cart = new Product[3]; // 카트
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족하여 살 수 없다. : " + p); // toString 정의 한 것을 뿌려준다.
			return;
		}
		// 가진돈 충분하면 돈에서 뺀다.
		money -= p.price;
		// 장바구니에 구입한 물건을 담는다.
		add(p);
	}

	void add(Product p) {
		if (i >= cart.length) { // 카트가 다 찼느냐 안찼느냐 카트보다 크면 
			Product[] tmp = new Product[cart.length * 2]; // 원래 있는 것에 두배
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp; // 카트 바꿔치기 cart에서 tmp로 바꿔치기 한다.
		}
		cart[i++] = p; // 카트에 물건을 넣는다.
	}

	void summary() {
		String itemList = "";
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) // 카트에 들어 있는게 없으면 종료한다.
				break;
			itemList += cart[i].toString() + ","; // 객체 + 문자열 toString(TV or Computer) 을 호출한다. 
			
			sum += cart[i].price;
		}
		
		System.out.println("구입한 물건 : "+ itemList);
		System.out.println("사용한 금액 : "+ sum);
		System.out.println("남은 돈 : "+ money);
	}
}
