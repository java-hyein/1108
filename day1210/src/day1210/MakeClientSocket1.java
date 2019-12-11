package day1210;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MakeClientSocket1 {
	Socket socket = null;
	
	PrintWriter writer = null;
	BufferedReader reader = null;
	
	public MakeClientSocket1() {
		try {
			socket = new Socket("localhost", 5433);
			writer = new PrintWriter(socket.getOutputStream(),true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String str = null;
			
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));
			
			while((str = sReader.readLine()) != null) {
				writer.println(str);
				System.out.println("output : " + str);
			}
			
			writer = new PrintWriter(socket.getOutputStream(),true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			writer.close();
			reader.close();
			socket.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MakeClientSocket1();
	}
}
