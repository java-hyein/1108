package day1106;

import java.util.Scanner;


//circle Ŭ������ circletest Ŭ������ �ϼ��϶�.
//���� �������� ���� 3���� circle ��ü �迭�� �����
//x,y,radius ���� �о� 3���� circle��ü�� ����� show()��
//�̿��Ͽ� �̵��� ��� ����Ѵ�.

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
