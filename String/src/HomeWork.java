import java.util.Scanner;
public class HomeWork {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String LastName= "ȫ";
		String FirstName = "�浿";
		
		
		System.out.format("===========================\n");
		System.out.format("����� ���� : %s\n", LastName);
		System.out.format("����� �̸��� : %s\n", FirstName);
		System.out.format("===========������Ʈ===========\n");
		System.out.println("a) �������� ");
		System.out.println("b) �̸� ���� ");
		System.out.println("x) ����");
		System.out.println("�Է��ϼ��� : ");
		String cmd =  scan.next();
		
		while(true) {
			if(cmd.equalsIgnoreCase("a")) {
				System.out.println("���ο� ���� �Է��ϼ��� : ");
			}else if (cmd.equalsIgnoreCase("b")) {
				
			}else if (cmd.equalsIgnoreCase("x")){
				return;
			}
		}
		

	}

}
