import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

// �ϳ��� �л� ������ ��Ÿ���� ��Ʃ��Ʈ Ŭ�������� �̸�, �а� , �й�, ��÷ ,��� �� �����ϴ� �ʵ尡 �ִ�
class Student {
	private String name, department, number;
	private double avg;

	public Student(String name, String department, String number, double avg) {
		this.name = name;
		this.department = department;
		this.number = number;
		this.avg = avg;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}

public class StudentTest {
	public static void main(String[] args) {
		ArrayList<Student> studentlist = new ArrayList<Student>();
		Scanner scan = new Scanner(System.in);
		System.out.println("�л��̸�, �а�, �й�, ���� ����� �Է��ϼ���");

		for (int i = 0; i < 4; i++) {
			System.out.print(">>");
			String line = scan.nextLine();

			StringTokenizer st = new StringTokenizer(line, ",");
			String name = st.nextToken().trim();
			String department = st.nextToken().trim();
			String number = st.nextToken().trim();
			double avg = Double.parseDouble(st.nextToken().trim());

			studentlist.add(new Student(name, department, number, avg));
		}
		for (Student s : studentlist) {
			System.out.println("---------------------");
			System.out.println(s.getName());
			System.out.println(s.getDepartment());
			System.out.println(s.getNumber());
			System.out.println(s.getAvg());
		}
	}

}
