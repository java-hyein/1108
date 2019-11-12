//철수 학생은 다음 3개의 필드와 메소드를 가진 4개의 클래스 Add, Sub, Mul, Div를 작성하려고 한다
//- int 타입의 a, b 필드: 2개의 피연산자
//- void setValue(int a, int b): 피연산자 값을 객체 내에 저장한다.
//- int calculate(): 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.
//곰곰 생각해보니, Add, Sub, Mul, Div 클래스에 공통된 필드와 메소드가 존재하므로
//새로운  Calc를 작성하고 Calc를 상속받아 만들면 되겠다고 생각했다. 
//그리고 main() 메소드에서 다음 실행 사례와 같이 2개의 정수와 연산자를 입력받은 후, 
//Add, Sub, Mul, Div 중에서 이 연산을 처리할 수 있는 객체를 생성하고 
//setValue() 와 calculate()를 호출하여 그 결과 값을 화면에 출력하면 된다고 생각하였다. 
//철수처럼 프로그램을 작성하라.
//
//두 정수와 연산자를 입력하시오 >> 5 7 +
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

		System.out.println("두 정수와 연상자를 입력하시오 : ");
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
