import java.util.Scanner;
public class HomeWork {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String LastName= "홍";
		String FirstName = "길동";
		
		
		System.out.format("===========================\n");
		System.out.format("당신의 성은 : %s\n", LastName);
		System.out.format("당신의 이름은 : %s\n", FirstName);
		System.out.format("===========수정파트===========\n");
		System.out.println("a) 성씨수정 ");
		System.out.println("b) 이름 수정 ");
		System.out.println("x) 종료");
		System.out.println("입력하세요 : ");
		String cmd =  scan.next();
		
		while(true) {
			if(cmd.equalsIgnoreCase("a")) {
				System.out.println("새로운 성을 입력하세요 : ");
			}else if (cmd.equalsIgnoreCase("b")) {
				
			}else if (cmd.equalsIgnoreCase("x")){
				return;
			}
		}
		

	}

}
