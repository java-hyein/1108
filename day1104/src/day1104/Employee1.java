// 필드 : 이름, 나이, 주소, 부서, 월급 정보를 필드로 선언
// 생성자 : 이름, 나이, 주소, 부서를 지정하는 생성자 정의
// 메소드 printInfo() : 인자는 없고 자신의 필드 이름, 나이, 주소, 부서를 출력
package day1104;

//printInfo(){
//return n,a,add,dep;	
//}
//printInfo(){
//
//}
class name {
	public name(String n) {
		System.out.println("이름 : " + n);
	}
}

class address {
	public address(String add) {
		System.out.println("주소 : " + add);
	}
}

class department {
	public department(String dep) {
		System.out.println("부서 : " + dep);
	}
}

class age {
	public age(int a) {
		System.out.println("나이 : " + a);
	}
}

class salary {
	public salary(int sal) {
		System.out.println("월급 : " + sal);
	}
}

public class Employee1 {
	public static void main(String[] args) {

		name n = new name("이혜인");
		address add = new address("서울시 마포구 ");
		department dep = new department("회계");
		age a = new age(12);
		salary sal = new salary(5000);
	}

}
