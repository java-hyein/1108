
class DanceTest {
	/* �޼��带 �ۼ��Ͻÿ� (1) action . */

	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot() };

		for (int i = 0; i < arr.length; i++) {
			action(arr[i]);
		}
		// main
	}
	private static void action(Robot r) {
		
		if (r instanceof DanceRobot) {
			((DanceRobot)r).dance();
		}
		if (r instanceof SingRobot) {
			((SingRobot)r).sing();
		}
		if (r instanceof DrawRobot) {
			((DrawRobot)r).draw();
		}
	}
}
//========================================================================================================
//	class Robot {
//	}
//
//	class DanceRobot extends Robot {
//		void dance() {
//			System.out.println("���� ��ϴ�.");
//		}
//	}
//}
//
//class SingRobot extends Robot {
//	void sing() {
//		System.out.println("�뷡�� �մϴ�.");
//	}
//}
//
//class DrawRobot extends Robot {
//	void draw() {
//		System.out.println("�׸��� �׸��ϴ�.");
//	}
//}