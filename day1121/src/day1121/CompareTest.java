package day1121;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Scanner;

public class CompareTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("대상파일 : ");
		String src = sc.nextLine();
		System.out.println("사본 이름 : ");
		String dst = sc.nextLine();

		boolean equal = false;

		try (BufferedInputStream f1 = new BufferedInputStream(new FileInputStream(src.trim()));
				BufferedInputStream f2 = new BufferedInputStream(new FileInputStream(dst.trim()))) {
			int data1, data2;

			if (f1.available() != f2.available()) { // 파일 길이 비교
				equal = false;
				System.out.println("다름");
			} else {
				equal = true;
				// 파일의 길이가 같을때 두 파일이 같다고 가정하고 while을 돌리면
				while ((data1 = f1.read()) != -1) { // a 가 파일의 끝을 만날ㄷ 까지
					data2 = f2.read(); // b를 읽어드림
					if (data1 != data2) { // 중간에 한글자다라도 다르면
						equal = false;// 두 파일은 같지않다 
						break;
						
					}
				}
			}

			if(equal == true){
				System.out.println("같아요");
			}else {
				System.out.println("다르다");
			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}

	}

}
