
public class PersonTest2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2("홍길동", "12345678");
		Person2 p2 = new Person2("홍길동", "12345678");
		Person2 p3 = new Person2("김철수", "12333333");
		
		 if(p1.equals(p2))
			 System.out.println("p1과 p2는 동일하다");
		 else
			 System.out.println("p1과 p2는 다르다");
		 
		 if(p1.equals(p3))
			 System.out.println("p1과 p3는 동일하다");
		 else
			 System.out.println("p1과 p3는 다르다");
	}

}
