package day1121;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class UpperTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("대상파일 : ");
		String src = sc.nextLine();
		System.out.println("사본 이름 : ");
		String dst = sc.nextLine();
		
		try(BufferedReader in = new BufferedReader(new FileReader(src));
				BufferedWriter out = new BufferedWriter(new FileWriter(dst))) {
			int data;
			while((data=in.read()) != -1) {
				if(data>=97 && data<=122) {
					out.write((char)(data-32)); //65 대문자 A 
					System.out.print((char)(data-32));
				}else {
					out.write(data);
					System.out.println((char)(data));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
