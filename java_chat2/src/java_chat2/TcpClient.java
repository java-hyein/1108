package java_chat2;

import java.net.Socket;

public class TcpClient {

	public static void main(String[] args) {
		try {
			String serverIP = "127.0.0.1";
			//소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverIP,1111);
			
			System.out.println("서버에 연결되었습니다.");
			Sender sender = new Sender(socket);
			Receiver receiver = new Receiver(socket);
			
			sender.start();
			receiver.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
