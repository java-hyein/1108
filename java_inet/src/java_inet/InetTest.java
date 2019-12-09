package java_inet;

import java.net.InetAddress;
import java.util.Scanner;

class InetAdressEx {
	Scanner scanner;

	public InetAdressEx() {
		System.out.println("Host 이름을 입력하세요");

		scanner = new Scanner(System.in);

		try {
			//자바에서 IP주소를 표현할때 사용하는 클래스이다.
			InetAddress inetAddress = InetAddress.getLocalHost();//InetAddress.getByName(scanner.next());

			System.out.println("Computer NAME : " + inetAddress.getHostName()); // 호스트 이름을 문자열로 반환
			System.out.println("Computer IP : " + inetAddress.getHostAddress()); // IP주소를 반환
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

public class InetTest {
	public static void main(String[] args) {
		new InetAdressEx(); 
	}

}
