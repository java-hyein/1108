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
			System.out.println("���� : " + title);
			System.out.println("���� : " + writer);
		}
}
class Books {
	public static void main(String[] args) {
		Book book1 = new Book ("C�� ���̴� �׸�å", "ANK");
		book1.print();
		Book book2 = new Book(book1);
		book2.title = "java�� ���̴� �׸�å";
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
//		System.out.println("���� : " + title);
//		System.out.println("���� : " + price);
//		System.out.println("�ֹ� ���� : " + num);
//		System.out.println("�հ�ݾ� : " + price * num);
//	}
//}
//	class Books {
//		public static void main(String[] args) {
//			Book book = new Book("java�� ���̴� �׸�å ", 12000);
//			book.num = 10;
//			book.print();
//		}
//	}
