// �ʵ� : �̸�, ����, �ּ�, �μ�, ���� ������ �ʵ�� ����
// ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ������ ����
// �޼ҵ� printInfo() : ���ڴ� ���� �ڽ��� �ʵ� �̸�, ����, �ּ�, �μ��� ���

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
		Employee employee = new Employee("Tom",20,"�����","����",10000);
		employee.printInfo();
	}
}
