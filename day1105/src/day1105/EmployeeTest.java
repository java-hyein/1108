package day1105;

import java.util.Scanner;

class Employee {
	public static String companyname = "��Ʈķ��";
	public String name, dept;
	public int age;

	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}


	public void printStaff() {
		System.out.println("===== �ֽ�ȸ�� " + companyname + " ���������ý��� ====");
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�μ� : " + dept);
		System.out.println("================================");
	}
}

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ��� : ");
		String name = scan.next();
		
		System.out.println("���̸� �Է����ּ��� : ");
		int age = scan.nextInt();
		
		System.out.println("�μ��� �Է����ּ��� : ");
		String dept = scan.next();
		
		Employee s1 = new Employee(name,age,dept);
		s1.printStaff();
		
		scan.close();
	}
	


}
