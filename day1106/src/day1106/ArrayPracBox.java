package day1106;

class Box1{
	private String conts;
	
	Box1(String cont){
		this.conts = cont;
	}
	public String toString() {
		return conts;
	}
	
}

public class ArrayPracBox {
	public static void main(String[] args) {
		Box[] ar = new Box[3];
		
		ar[0] = new Box("First");
		ar[1] = new Box("Second");
		ar[2] = new Box("Third");
		
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
	}
}
