// �ʵ� : �̸�, ����, �ּ�, �μ�, ���� ������ �ʵ�� ����
// ������ : �̸�, ����, �ּ�, �μ��� �����ϴ� ������ ����
// �޼ҵ� printInfo() : ���ڴ� ���� �ڽ��� �ʵ� �̸�, ����, �ּ�, �μ��� ���
package day1104;

//printInfo(){
//return n,a,add,dep;	
//}
//printInfo(){
//
//}
class name {
	public name(String n) {
		System.out.println("�̸� : " + n);
	}
}

class address {
	public address(String add) {
		System.out.println("�ּ� : " + add);
	}
}

class department {
	public department(String dep) {
		System.out.println("�μ� : " + dep);
	}
}

class age {
	public age(int a) {
		System.out.println("���� : " + a);
	}
}

class salary {
	public salary(int sal) {
		System.out.println("���� : " + sal);
	}
}

public class Employee1 {
	public static void main(String[] args) {

		name n = new name("������");
		address add = new address("����� ������ ");
		department dep = new department("ȸ��");
		age a = new age(12);
		salary sal = new salary(5000);
	}

}
