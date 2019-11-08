package test;

public class Book {
		String title;
		String writer;
		
		Book(String t, String w){
			title = t;
			writer = w;
		}
		Book(Book copy){
			title = copy.title;
			writer = copy.writer;
		}
		
		void print() {
			System.out.println("제목 : " + title);
			System.out.println("저자 : " + writer);
		}
}
class Books {
	public static void main(String[] args) {
		Book book1 = new Book ("C가 보이는 그림책", "ANK");
		book1.print();
		Book book2 = new Book(book1);
		book2.title = "java가 보이는 그림책";
		book2.print();
	}
}

//	int price;
//	int num = 0;
//	String title;
//	
//	Book (String t, int p) {
//		title = t;
//		price = p;
//	}
//	
//	void print() {
//		System.out.println("제목 : " + title);
//		System.out.println("가격 : " + price);
//		System.out.println("주문 수량 : " + num);
//		System.out.println("합계금액 : " + price * num);
//	}
//}
//	class Books {
//		public static void main(String[] args) {
//			Book book = new Book("java가 보이는 그림책 ", 12000);
//			book.num = 10;
//			book.print();
//		}
//	}
