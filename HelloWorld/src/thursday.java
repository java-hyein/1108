
public class thursday {

//	public static void main(String[] args) {

//		int num = 1;
//		
//		while(true) {
//			if((num % 6 == 0) && ((num % 14) == 0))
//				break;
//			num++;
//			}
		// ������
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 1; j<=9; j++){
//				System.out.println(i +" x "+ j + "= " + (i*j));
//			}
//		}
//		//������� Ȧ���� �����ܸ� �����ÿ�
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
//		//������� ¦���� �����ܸ� �����ÿ�
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
//		//9�ܺ��� 1�� ���� �����ÿ�.
//		for(int i = 9; i >= 1; i--) {
//			for(int j = 1; j<=9; j++){
//				System.out.println(i +" x "+ j + "= " + (i*j));
//			}
//		}
//		//�����1
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
//		//����� 2
//			for(int i = 5; i >= 1; i--) {
//				for(int j = 1; j<=i; j++) {
//					System.out.print("*");
//				}
//				System.out.println(" ");
//			}
//		System.out.println("���α׷��� ����");
//		hiEveryone(12);
//		hiEveryone(13);
//		System.out.println("���α׷��� ��");
//		}
//		public static void hiEveryone(int age) {
//			System.out.println("���� ��ħ�Դϴ�.");
//			System.out.println("�� ���̴� " + age +"�� �Դϴ�.");
//		double myHeight = 175.9;
//		hiEveryone(12, 12.5);
//		hiEveryone(13, myHeight);
//		byEveryone();
//		}
//	public static void hiEveryone(int age, double height) {
//		System.out.println("�� ���̴� "+ age +"�� �Դϴ�.");
//		System.out.println("���� Ű�� "+ height +"cm �Դϴ�.");
//	}
//	public static void byEveryone() {
//		System.out.println("������ �˰ڽ��ϴ�.");

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
//		// ���� ���̸� ���ϴ� �Լ��� ����ÿ�
//		double circleResult;
//		circleResult = circleSize(6);
//		System.out.println("���� ���̴� (r^2): " + circleResult);
//
//		int triangleResult;
//		triangleResult = triangleSize(20, 20);
//		System.out.println("�ﰢ���� ���̴�(�غ� x ����) : " + triangleResult);
//
//	}
//
//	public static double circleSize(int half) {
//		final double PI = 3.14;
//		return (double)(half * half) * PI;
//	}
//
//	// ���� ���θ� �޾� �ﰢ�� ���̸� ���ϴ� ���� ����ÿ�
//	public static int triangleSize(int width, int height) {
//		return ((width * height) / 2);
//	}
//		divide(4,2);
//		divide(6,2);
//		divide(9,0);
//	}
//	public static void divide(int num1, int num2) {
//		if(num2 == 0) {
//			System.out.println("0���� ���� �� �����ϴ�.");
//			return;
//		}
//		System.out.println("������ ��� : "+(num1 / num2));
		
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
			System.out.println("�ܾ� : "+ balance);
			return;
		}
}
