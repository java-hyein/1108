package day1106;
//circle 클래스와 circletest 클래스를 완성하라.

//다음 실행결과와 같이 3개의 circle 객체 배열을 만들고
//x,y,radius 값을 읽어 3개의 circle객체를 만들고 show()를
//이용하여 이들을 모두 출력한다.

import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) { // 생성자 초기화
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public void show() {
		System.out.println("(" + x + "," + y + ")" + radius);
	}
}

public class CircleTest {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		Circle[] circle = new Circle[3];
		for (int i = 0; i < circle.length; i++) {// 3번 돌린다
			System.out.print("x, y, radius >> ");
			
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			circle[i] = new Circle(x, y, radius); //객체 생성 
		}
		for (Circle c : circle) {
			c.show();
		}
	}

}
