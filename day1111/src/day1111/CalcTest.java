//ö�� �л��� ���� 3���� �ʵ�� �޼ҵ带 ���� 4���� Ŭ���� Add, Sub, Mul, Div�� �ۼ��Ϸ��� �Ѵ�
//- int Ÿ���� a, b �ʵ�: 2���� �ǿ�����
//- void setValue(int a, int b): �ǿ����� ���� ��ü ���� �����Ѵ�.
//- int calculate(): Ŭ������ ������ �´� ������ �����ϰ� ����� �����Ѵ�.
//���� �����غ���, Add, Sub, Mul, Div Ŭ������ ����� �ʵ�� �޼ҵ尡 �����ϹǷ�
//���ο�  Calc�� �ۼ��ϰ� Calc�� ��ӹ޾� ����� �ǰڴٰ� �����ߴ�. 
//�׸��� main() �޼ҵ忡�� ���� ���� ��ʿ� ���� 2���� ������ �����ڸ� �Է¹��� ��, 
//Add, Sub, Mul, Div �߿��� �� ������ ó���� �� �ִ� ��ü�� �����ϰ� 
//setValue() �� calculate()�� ȣ���Ͽ� �� ��� ���� ȭ�鿡 ����ϸ� �ȴٰ� �����Ͽ���. 
//ö��ó�� ���α׷��� �ۼ��϶�.
//
//�� ������ �����ڸ� �Է��Ͻÿ� >> 5 7 +
//12
package day1111;

import java.util.Scanner;

import day1111.Calc.Add;
import day1111.Calc.Div;
import day1111.Calc.Mul;
import day1111.Calc.Sub;


public class CalcTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("�� ������ �����ڸ� �Է��Ͻÿ� : ");
		int a = scan.nextInt();
		int b = scan.nextInt();

		String num = scan.next();

		switch (num) {
		case ("+"):
			Add add = new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
		case ("-"):
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());
			break;
		case ("*"):
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
		case ("/"):
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;

		}

	}
}
