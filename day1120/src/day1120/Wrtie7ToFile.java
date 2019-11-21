package day1120;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Wrtie7ToFile {

	public static void main(String[] args) throws IOException {
		OutputStream out = new FileOutputStream("data.dat");
		out.write(7);
		out.close();
	}

}
