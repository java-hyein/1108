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

		System.out.println("수학, 과학, 영어, 순으로 3개의 정수 입력 >> ");

		int math = sc.nextInt();
		int english = sc.nextInt();
		int science = sc.nextInt();

		Grade me = new Grade(math, science, english);
		System.out.println("평균은  " + me.average());

	}

}
