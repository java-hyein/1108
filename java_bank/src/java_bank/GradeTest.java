package java_bank;

import java.util.Scanner;

class Grade {
	int math, english, science;

	Grade(int math, int english, int science) {
		this.math = math;
		this.english = english;
		this.science = science;

	}

	double average() {
		return (math + english + science) / 3.0;
	}
}

public class GradeTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("����, ����, ����, ������ 3���� ���� �Է� >> ");

		int math = sc.nextInt();
		int english = sc.nextInt();
		int science = sc.nextInt();

		Grade me = new Grade(math, science, english);
		System.out.println("�����  " + me.average());

	}

}
