
public class BoxTest {

	public static void main(String[] args) {
		
		// ���ʸ� ����----
//		Box aBox = new Box(); // ���� ����
//		Box oBox = new Box(); // ���� ����
//
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();

		aBox.set(new Apple()); // ���ڿ� ����� ��´�
		oBox.set(new Orange()); // ���ڿ� �������� ��´�
		
		// ���ʸ� ����----
//		Apple ap = (Apple) aBox.get(); // ���ڿ��� ����� ������
//		Orange og = (Orange) oBox.get(); // ���ڿ��� �������� ������

		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);
		System.out.println(og);
	}

}
