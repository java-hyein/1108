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
		System.out.println("��� ���� : ");
		String src = scan.nextLine();
		System.out.println("�纻�̸� : ");
		String dst = scan.nextLine();
		
		try(FileInputStream in = new FileInputStream(src);
				FileOutputStream out = new FileOutputStream(dst)){
			int data;
			while(true) {
				data = in.read(); //���Ϸκ��� 1����Ʈ�� �д´�.
				if(data == -1) // ���̻� �о���� �����Ͱ� ���ٸ�
					break;
				out.write(data); // ���Ͽ� 1����Ʈ�� ����. 
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
