
public class PersonTest2 {

	public static void main(String[] args) {
		Person2 p1 = new Person2("ȫ�浿", "12345678");
		Person2 p2 = new Person2("ȫ�浿", "12345678");
		Person2 p3 = new Person2("��ö��", "12333333");
		
		 if(p1.equals(p2))
			 System.out.println("p1�� p2�� �����ϴ�");
		 else
			 System.out.println("p1�� p2�� �ٸ���");
		 
		 if(p1.equals(p3))
			 System.out.println("p1�� p3�� �����ϴ�");
		 else
			 System.out.println("p1�� p3�� �ٸ���");
	}

}
