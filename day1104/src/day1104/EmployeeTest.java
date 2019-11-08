// 필드 : 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
// 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
// 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력

package day1104;

class Employee {
	private String name;
	private int age;
	private String address;
	private String department;
	private int salary;
	
	public Employee(String name, int age, String address, String department, int salary) {
		this.name= name;
		this.age = age;
		this.address= address;
		this.department = department;
		this.salary= salary;
	}
	public void printInfo() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(department);
		System.out.println(salary);
	}
}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee("Tom",20,"서울시","영업",10000);
		employee.printInfo();
	}
}
