package java_bank;

class TV{
	String brand;
	int year, inch;
	
	TV(String brand, int year, int inch){
		this.brand = brand;
		this.inch = inch;
		this.year = year;
	}
	public void show() {
		System.out.println(brand +"에서 만든 "+ year +"년 형 "+ inch +"인치");
	}

}

public class TVTest {

	public static void main(String[] args) {
		
		TV myTV = new TV("LG", 2017, 32);
		myTV.show();
	}

}
