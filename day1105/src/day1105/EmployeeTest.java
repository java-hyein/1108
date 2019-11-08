package day1105;

import java.util.Scanner;

class Employee {
	public static String companyname = "비트캠프";
	public String name, dept;
	public int age;

	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}


	public void printStaff() {
		System.out.println("===== 주식회사 " + companyname + " 인적관리시스템 ====");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("부서 : " + dept);
		System.out.println("================================");
	}
}

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요 : ");
		String name = scan.next();
		
		System.out.println("나이를 입력해주세요 : ");
		int age = scan.nextInt();
		
		System.out.println("부서를 입력해주세요 : ");
		String dept = scan.next();
		
		Employee s1 = new Employee(name,age,dept);
		s1.printStaff();
		
		scan.close();
	}
	


}
