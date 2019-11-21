package day1120;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.OutputStream;

public class filecopy {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("대상 파일 : ");
		String src = scan.nextLine();
		System.out.println("사본이름 : ");
		String dst = scan.nextLine();
		
		try(FileInputStream in = new FileInputStream(src);
				FileOutputStream out = new FileOutputStream(dst)){
			int data;
			while(true) {
				data = in.read(); //파일로부터 1바이트를 읽는다.
				if(data == -1) // 더이상 읽어들잉 데이터가 없다면
					break;
				out.write(data); // 파일에 1바이트를 쓴다. 
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
