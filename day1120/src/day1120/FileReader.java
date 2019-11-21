package day1120;

import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("읽을 파일 : ");
		String src= scan.nextLine();
		
		try(Reader in = new FileReader(src)){
			int ch;
			
			while(true) {
				ch = in.read();
				if(ch == -1)
					break;
				System.out.println((char)ch);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
