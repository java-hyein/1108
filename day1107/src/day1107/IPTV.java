package day1107;

public class IPTV extends ColorTV {

	private String ip;

	IPTV(String ip, int size, int color) {
		super(color, size);
		this.ip = ip;
	}

	String getIp() {
		return ip;
	}

	public void printProperty() {
		System.out.println("���� IPTV�� " + getIp() + "�ּ��� "+ super.getSize() + super.getColor()); 
		//+ super.getSize() + super.getColor());
		//super.printProperty();
	}
}
