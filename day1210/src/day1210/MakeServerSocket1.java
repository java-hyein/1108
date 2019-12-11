package day1210;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class MakeServerSocket1 {
	ServerSocket serversocket = null;
	Socket socket = null;

	BufferedReader reader = null;
	PrintWriter writer = null;
	String lineStr;

	public MakeServerSocket1() {
		try {
			serversocket = new ServerSocket(5433);

			while (true) {
				socket = serversocket.accept();
				System.out.println("Client 요청됨");

				writer = new PrintWriter(socket.getOutputStream(), true);
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

				while ((lineStr = reader.readLine()) != null) {
					writer.write(lineStr);
					System.out.println("input : " + lineStr);
				}
				writer.close();
				reader.close();
				socket.close();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new MakeServerSocket1();
	}
}
