import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	}
	public static void writeObjects() {
		ArrayList<Contact> contact = new ArrayList<Contact>();
		for (int i= 0; i <3; i++) {
			Contact contact = new Contact();
			contact.setFirstName("�浿" + i);
			contact.setLastName("ȫ" + i);
			contacts.add(contact);
		}
		try {
			FileOutputStream os =  new FileOutputStream("contact.dat");
			ObjectOutputStream output = new ObjectOutputStream(os);
			
			for (Contact contact : contacts) {
				output.writeObject(contact);
			}
			output.flush();
			output.close();
			os.close();
		}catch (Exception ex) {
			ex.printStackTrace();
		}
//		Scanner scan = new Scanner(System.in);
//		System.out.println("arg : "+ args);
//		for (String arg : args) {
//			System.out.println("arg : "+ arg);
//		}
//
//		try {
//			System.out.print("������ ģ���� �ο��� : ");
//			int count = scan.nextInt();
//			
//			PrintWriter printer = new PrintWriter("ģ�� ���.txt");
//			for(int i = 0; i < count; i++) {
//				System.out.print("ģ���� �̸��� : ");
//				
//				String name = scan.next();
//				name.trim();
//				
//				printer.println(name);
//			}
//			printer.close();
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
//		
//		public static void readfile() {
//			try {
//				File file = new File("friends.txt");
//				if(!file.exists())
//					return;
//				Scanner scanner =new Scanner(file);
//				
//				while(scanner.hasNext()) {
//					String name = scanner.next();
//					System.out.format("�̸� : %s\n", name);
//				}
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
//	}
//		public static void writeFile() {
//			
//		}
 }
}
