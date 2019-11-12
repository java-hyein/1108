
public class INumTest {

	public static void main(String[] args) {
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);

		if(num1.equals(num2)) //다르다
			System.out.println("num1, num2 내용 동일하다"); 
		else
			System.out.println("num1, num2 내용 다르다");
		
		if(num1.equals(num3))//동일하다
			System.out.println("num1, num3 내용 동일하다");
		else
			System.out.println("num1, num3 내용 다르다");
	}

}
