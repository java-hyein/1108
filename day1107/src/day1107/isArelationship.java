package day1107;

class MobilePhone {
	protected String number; // �ʵ�

	public MobilePhone(String num) { // ������ �ʱ�ȭ
		number = num;
	}

	public void answer() { // �޼���(��ɺ�)
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone { // SmartPhone �� MobilePhone �� ��� ����
	private String androidVer;

	public SmartPhone(String num, String ver) { // �������� �Ű������� �θ��� �� ���� �ʱ�ȭ �Ѵ�
		super(num); // �θ�Ŭ������ �����͸� �ʱ�ȭ �Ҷ� ���� ��
		androidVer = ver;
	}

	public void playApp() {
		System.out.println("App is running in " + androidVer);
	}
}

public class isArelationship {

	public static void main(String[] args) {
		MobilePhone phone = new SmartPhone("010-5555-7777", "Nougat");
		phone.answer();
		((SmartPhone)phone).playApp();

	}

}
