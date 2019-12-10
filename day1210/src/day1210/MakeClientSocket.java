package day1210;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class MakeClientSocket {
	Socket socket = null;

	PrintWriter writer = null;
	BufferedReader reader = null;

	public MakeClientSocket() {
		try {
			socket = new Socket("192.168.6.9", 2000); // 로컬호스트(자기를 나타냄), 서버 번호와 맞춤
			writer = new PrintWriter(socket.getOutputStream(), true); // 클라이언트로 보내는 쪽
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 가져오는 쪽

			String str = null;
			// 보내는 부분
			BufferedReader sReader = new BufferedReader(new InputStreamReader(System.in));

			while ((str = sReader.readLine()) != null) {
				writer.println(str);
				System.out.println("output : " + str);
			}
			// 받는 부분
			writer = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

//			while ((lineStr = reader.readLine()) != null) {
//				writer.write(lineStr);
//				System.out.println("input : " + lineStr);
//			}

			writer.close();
			reader.close();
			socket.close();
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		new MakeClientSocket();
	}

}
