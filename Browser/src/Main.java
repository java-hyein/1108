import java.io.*;
public class Main {
	public static void main(String[] args) {
		File file;
		
		try {
			file = new File("C:\\Users\\user");
			System.out.println("exists : " + file.exists());
			System.out.println("isDiretory : " + file.isDirectory());
			System.out.println("isFile : " + file.isFile());
			
			String[] files = file.list();
			for (String child : files) {
				System.out.format("%s, isDirectory : %b\n",child.getName(),child.isDirectory());
			}
			}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
