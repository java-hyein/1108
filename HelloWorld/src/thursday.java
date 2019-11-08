
public class thursday {

//	public static void main(String[] args) {

//		int num = 1;
//		
//		while(true) {
//			if((num % 6 == 0) && ((num % 14) == 0))
//				break;
//			num++;
//			}
		// 구구단
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j<=9; j++){
//				System.out.println(i +" x "+ j + "= " + (i*j));
//			}
//		}
//		//결과값이 홀수인 구구단만 찍으시오
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j<=9; j++){
//				if((i*j) % 2 == 1) {
//				System.out.println(i +" x "+ j + "= " + (i*j));
//					}
//				}
//			}
//		System.out.println("");
//		System.out.println("");
//		
//		//결과값이 짝수인 구구단만 찍으시오
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j<=9; j++){
//				if((i*j) % 2 == 0) {
//				System.out.println(i +" x "+ j + "= " + (i*j));
//					}
//				}
//			}
//		System.out.println("");
//		System.out.println("");
//		
//		//9단부터 1단 까지 찍으시오.
//		for(int i = 9; i >= 1; i--) {
//			for(int j = 1; j<=9; j++){
//				System.out.println(i +" x "+ j + "= " + (i*j));
//			}
//		}
//		//별찍기1
//			for(int i=1; i<=5; i++) {
//				for(int j=1; j<= i;j++) {
//					System.out.print("*");
//				}
//				System.out.println("");
//			}
//			
//			System.out.println("");
//			System.out.println("");
//			
//		//별찍기 2
//			for(int i = 5; i >= 1; i--) {
//				for(int j = 1; j<=i; j++) {
//					System.out.print("*");
//				}
//				System.out.println(" ");
//			}
//		System.out.println("프로그램의 시작");
//		hiEveryone(12);
//		hiEveryone(13);
//		System.out.println("프로그램의 끝");
//		}
//		public static void hiEveryone(int age) {
//			System.out.println("좋은 아침입니다.");
//			System.out.println("제 나이는 " + age +"세 입니다.");
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(13, myHeight);
//		byEveryone();
//		}
//	public static void hiEveryone(int age, double height) {
//		System.out.println("제 나이는 "+ age +"세 입니다.");
//		System.out.println("저의 키는 "+ height +"cm 입니다.");
//	}
//	public static void byEveryone() {
//		System.out.println("다음에 뵙겠습니다.");

//		int result;
//		result = adder(4,5);
//		System.out.println("4 + 5 = " + result);
//		System.out.println("3.5 x 3.5 = " + square(3.5));
//	}
//	public static int adder(int num1, int num2) {
//		int addResult = num1 + num2;
//		return addResult;
//	}
//	public static double square(double num) {
//		return num * num;
//		// 원의 넓이를 구하는 함수를 만드시오
//		double circleResult;
//		circleResult = circleSize(6);
//		System.out.println("원의 넓이는 (r^2): " + circleResult);
//
//		int triangleResult;
//		triangleResult = triangleSize(20, 20);
//		System.out.println("삼각형의 넓이는(밑변 x 높이) : " + triangleResult);
//
//	}
//
//	public static double circleSize(int half) {
//		final double PI = 3.14;
//		return (double)(half * half) * PI;
//	}
//
//	// 가로 세로를 받아 삼각형 넓이를 구하는 수를 만드시오
//	public static int triangleSize(int width, int height) {
//		return ((width * height) / 2);
//	}
//		divide(4,2);
//		divide(6,2);
//		divide(9,0);
//	}
//	public static void divide(int num1, int num2) {
//		if(num2 == 0) {
//			System.out.println("0으로 나눌 수 없습니다.");
//			return;
//		}
//		System.out.println("나눗셈 결과 : "+(num1 / num2));
		
		static int balance = 0;
		public static void main(String[] args) {
			deposit(10000);
			checkMyBalance();
			withdraw(3000);
			checkMyBalance();
		}
		public static int deposit(int amount) {
			balance += amount;
			return balance;
	}
		public static int withdraw(int amount) {
			balance -= amount;
			return balance;
		}
		public static void checkMyBalance() {
			System.out.println("잔액 : "+ balance);
			return;
		}
}
