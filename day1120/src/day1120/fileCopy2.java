package day1120;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;



public class fileCopy2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("대상 파일 : ");
		String src = scan.nextLine();
		System.out.println("사본이름 : ");
		String dst = scan.nextLine();
		
		try(InputStream in = new FileInputStream(src);
				OutputStream out = new FileOutputStream(dst)){
			byte buf[] =  new byte[1024];
			int len;
			
			while(true) {
				len= in.read(buf);
				if(len == -1)
					break;
				out.write(buf,0,len);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
