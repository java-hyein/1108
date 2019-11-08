import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) {
	}
	public static void writeObjects() {
		ArrayList<Contact> contact = new ArrayList<Contact>();
		for (int i= 0; i <3; i++) {
			Contact contact = new Contact();
			contact.setFirstName("길동" + i);
			contact.setLastName("홍" + i);
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
//			System.out.print("저장할 친구의 인원은 : ");
//			int count = scan.nextInt();
//			
//			PrintWriter printer = new PrintWriter("친구 목록.txt");
//			for(int i = 0; i < count; i++) {
//				System.out.print("친구의 이름은 : ");
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
//					System.out.format("이름 : %s\n", name);
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
