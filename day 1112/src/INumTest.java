
public class INumTest {

	public static void main(String[] args) {
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);

		if(num1.equals(num2)) //�ٸ���
			System.out.println("num1, num2 ���� �����ϴ�"); 
		else
			System.out.println("num1, num2 ���� �ٸ���");
		
		if(num1.equals(num3))//�����ϴ�
			System.out.println("num1, num3 ���� �����ϴ�");
		else
			System.out.println("num1, num3 ���� �ٸ���");
	}

}
