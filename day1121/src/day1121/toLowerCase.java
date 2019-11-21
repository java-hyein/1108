package day1121;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class toLowerCase {

	public static void main(String[] args) {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("lc.txt"))) {
			bw.write("you can achieve anything you set your mind to");
			bw.write("\nyes we can");
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
