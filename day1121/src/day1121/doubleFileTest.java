package day1121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class doubleFileTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		try(BufferedReader f1 = new BufferedReader(new FileReader(sc.next()));
				BufferedReader f2 = new BufferedReader(new FileReader(sc.next()));
				BufferedWriter f3 = new BufferedWriter(new FileWriter(sc.next()))){
			
			int data;
			
			while((data = f1.read()) != -1) {
				f3.write(data);
			}
			while((data = f2.read()) != -1) {
				f3.write(data);
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
