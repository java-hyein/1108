package day1106;

import java.util.Scanner;


//circle 클래스와 circletest 클래스를 완성하라.
//다음 실행결과와 같이 3개의 circle 객체 배열을 만들고
//x,y,radius 값을 읽어 3개의 circle객체를 만들고 show()를
//이용하여 이들을 모두 출력한다.

class Circle1{
	int radius;
	double x,y;
	
	Circle1(double x, double y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}

}

public class CircleTest1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("x, y, radius >> ");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		int radius = scan.nextInt();

		
		Circle1 cr = new Circle1(x, y, radius);
		
		cr.show();
		
		scan.close();
	}


}
