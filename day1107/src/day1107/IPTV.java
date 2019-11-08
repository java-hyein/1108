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
		System.out.println("나의 IPTV는 " + getIp() + "주소의 "+ super.getSize() + super.getColor()); 
		//+ super.getSize() + super.getColor());
		//super.printProperty();
	}
}
