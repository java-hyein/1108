
public class HelloWorld {

	public static void main(String[] args) {
		//System.out.println("HelloWorld");
//		System.out.println(7);
//		System.out.println(3.15);
//		System.out.println("3 + 5 = " + 8);
//		System.out.println(3.15 + "는 실수 입니다.");
//		System.out.println("3 + 5" + "의 연산 결과는 8 입니다.");
//		System.out.println(8);
//		
//		int num1;
//		num1 = 10;
//		
//		int num2 = 20;
//		int num3 = num1 + num2;
//		System.out.println(num1 + "+" + num2 + "=" + num3);
//
//		double num1, num2;
//		double result;
//		num1 = 1.0000001;
//		num2 = 2.0000001;
//		result = num1 + num2;
//		System.out.println(result);
//		
//		short num1 = 11;
//		short num2 = 22;
//		
//		int result = num1 + num2;
//		System.out.println(result);
//		
//		char ch1 = '헐';
//		char ch2 = '확';
//		char ch3 = 54736;
//		char ch4 = 54869;
//		char ch5 = 0xD5D0;
//		char ch6 = 0xD655;
//		System.out.println(ch1 + " " +ch2);
//		System.out.println(ch3 + " " +ch4);
//		System.out.println(ch5 + " " +ch6);
//		
//		boolean b1 = true;
//		boolean b2 = false;
//		
//		System.out.println(b1);
//		System.out.println(b2);
//		
//		int num1 = 10;
//		int num2 = 20;
//		
//		System.out.println(num1 < num2);
//		System.out.println(num1 > num2);
//		
//		final int MAX_SIZE = 100;
//		final char CONST_CHAR = '상';
//		final int CONST_ASSIGNED;
//		
//		CONST_ASSIGNED = 12;
//		System.out.println("상수 1 : " + MAX_SIZE);
//		System.out.println("상수 2 : " + CONST_CHAR);
//		System.out.println("상수 1 : " + CONST_ASSIGNED);
//
//		int num1 = 123; //10진수 표현
//		int num2 = 0123;//8진수 표현
//		int num3 = 0x123;//16진수 표현
//		
//		System.out.println("num1: "+ num1);
//		System.out.println("num2: "+ num2);
//		System.out.println("num3: "+ num3);
//		x
//		System.out.println("11 + 22 + 33 = "+(11+22+33));
//		System.out.println("011 + 022 + 033 = "+ (011 + 022 + 033));
//		System.out.println("0x11 + 0x22 + 0x33 = " + (0x11 + 0x22 + 0x33));
//
//		byte seven = 0B111;
//		int num205 = 0B11001101;
//		System.out.println(seven);
//		System.out.println(num205);
//		
//		int num1 = 3;
//		int num2 = 4;
//		
//		double result = (double)num1/num2;
//		System.out.println(result);
//
//		double pi = 3.1415;
//		int wholeNumber = (int)pi;
//		System.out.println(pi);
// ========================chapter 4 연산자 ===============================
//		int num1 = 7;
//		int num2 = 3;
//		
//		System.out.println("num1 + num2 = " + (num1 + num2));
//		System.out.println("num1 - num2 = " + (num1 - num2));
//		System.out.println("num1 * num2 = " + (num1 * num2));
//		System.out.println("num1 / num2 = " + (num1 / num2));
//		System.out.println("num1 % num2 = " + (num1 % num2));
//		
//		System.out.println(7.0/3.0);
//		
//		short num = 10;
//		num = (short)(num + 77L);
//		int rate = 3;
//		rate = (int)(rate * 3.5);
//		System.out.println(num);
//		System.out.println(rate);
//		
//		num = 10;
//		num += 77L;
//		rate = 3;
//		rate *= 3.5;
//		System.out.println(num);
//		System.out.println(rate);
//		
//		System.out.println("3>=2 : " + (3 >=2));
//		System.out.println("3<=2 : " + (3 <=2));
//		System.out.println("7.0 == 7 : " + (7.0 == 7));
//		System.out.println("7.0 != 7  : " + (7.0 != 7));
//		int num2 = 22;
//		boolean result;
//		
//		result = !(num2 !=0);
//		//num2가 0인 아닌가? - true , 전체의 !(not)이니까 false 리턴.
//		System.out.println(result);
//		int num = 5;
//		System.out.print((num++)+ " ");
//		System.out.print((num++)+ " ");
//		System.out.print(num + "\n");
//		
//		System.out.print((num--)+ " ");
//		System.out.print((num--)+ " ");
//		System.out.print(num);
//		
//		byte num;
//		
//		num = 2; //00000010
//		System.out.print((byte)(num<< 1)+ " "); //00000100
//		System.out.print((byte)(num<< 2)+ " "); //00001000
//		System.out.print((byte)(num<< 3)+ " " + '\n'); //00010000
//		
//		num = 8; //00001000
//		System.out.print((byte)(num>> 1)+ " "); //00000100
//		System.out.print((byte)(num>> 2)+ " "); //00000010
//		System.out.print((byte)(num>> 3)+ " " + '\n'); //00000001
//		
//		num = -8; //11111000
//		System.out.print((byte)(num>> 1)+ " "); //11111100
//		System.out.print((byte)(num>> 2)+ " "); //11111110
//		System.out.print((byte)(num>> 3)+ " " + '\n'); //11111111
		int n1 = 5;
		int n2 = 7;
		
		//if문
		if(n1 < n2) {
			System.out.println("n1 > n2 is true");
		}
		
		//if~else문
		if(n1 == n2) {
			System.out.println("n1 == n2 is true");
		}else {
			System.out.println("n1 == n2 is false");
		}
		
		
	}
}
