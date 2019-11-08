package day1107;

class MobilePhone {
	protected String number; // 필드

	public MobilePhone(String num) { // 생성자 초기화
		number = num;
	}

	public void answer() { // 메서드(기능부)
		System.out.println("Hi~ from " + number);
	}
}

class SmartPhone extends MobilePhone { // SmartPhone 이 MobilePhone 을 상속 받음
	private String androidVer;

	public SmartPhone(String num, String ver) { // 생성자의 매개변수는 부모의 것 까지 초기화 한다
		super(num); // 부모클래스의 데이터를 초기화 할때 쓰는 것
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
