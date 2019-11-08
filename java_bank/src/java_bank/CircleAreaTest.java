package java_bank;

class CircleArea{

	double radius;
	
	CircleArea(double radius){
//		if(radius < 0) {
//			System.out.println("음수는 안됩니다.");
//			return;
//		}
		this.radius = radius;
	}
	
	double getArea() {
		
		return radius*radius*Math.PI;
	}
}

public class CircleAreaTest {

	public static void main(String[] args) {
		
		CircleArea area = new CircleArea(10);
		System.out.println(area.getArea());
	}
}
