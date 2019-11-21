package day1121;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class toUpperCase {

	public static void main(String[] args) {
		try(BufferedReader uc = new BufferedReader(new FileReader("lc.txt"))){
			String str;
			while(true) {
				str = uc.readLine();
				if(str == null)
					break;
				
				System.out.println(str.toUpperCase());
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
