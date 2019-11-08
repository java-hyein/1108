package day1106;
//circle Ŭ������ circletest Ŭ������ �ϼ��϶�.

//���� �������� ���� 3���� circle ��ü �迭�� �����
//x,y,radius ���� �о� 3���� circle��ü�� ����� show()��
//�̿��Ͽ� �̵��� ��� ����Ѵ�.

import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;

	public Circle(double x, double y, int radius) { // ������ �ʱ�ȭ
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
		for (int i = 0; i < circle.length; i++) {// 3�� ������
			System.out.print("x, y, radius >> ");
			
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			int radius = scan.nextInt();
			circle[i] = new Circle(x, y, radius); //��ü ���� 
		}
		for (Circle c : circle) {
			c.show();
		}
	}

}
