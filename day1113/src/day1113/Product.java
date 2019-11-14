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

class Buyer { // �Һ���
	int money = 1000;
	Product[] cart = new Product[3]; // īƮ
	int i = 0;

	void buy(Product p) {
		if (money < p.price) {
			System.out.println("�ܾ��� �����Ͽ� �� �� ����. : " + p); // toString ���� �� ���� �ѷ��ش�.
			return;
		}
		// ������ ����ϸ� ������ ����.
		money -= p.price;
		// ��ٱ��Ͽ� ������ ������ ��´�.
		add(p);
	}

	void add(Product p) {
		if (i >= cart.length) { // īƮ�� �� á���� ��á���� īƮ���� ũ�� 
			Product[] tmp = new Product[cart.length * 2]; // ���� �ִ� �Ϳ� �ι�
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp; // īƮ �ٲ�ġ�� cart���� tmp�� �ٲ�ġ�� �Ѵ�.
		}
		cart[i++] = p; // īƮ�� ������ �ִ´�.
	}

	void summary() {
		String itemList = "";
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null) // īƮ�� ��� �ִ°� ������ �����Ѵ�.
				break;
			itemList += cart[i].toString() + ","; // ��ü + ���ڿ� toString(TV or Computer) �� ȣ���Ѵ�. 
			
			sum += cart[i].price;
		}
		
		System.out.println("������ ���� : "+ itemList);
		System.out.println("����� �ݾ� : "+ sum);
		System.out.println("���� �� : "+ money);
	}
}
