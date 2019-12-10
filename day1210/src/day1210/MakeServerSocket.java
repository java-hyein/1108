package day1210;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

//채팅을만들기 위해서는 서버와 클라이언트 개념을 알아야한다.
// 한명은 기다려줘야하는 상황이 생길 수 밖에 없다.
//서버 부분

public class MakeServerSocket {
	// 통신에 관한 것들
	ServerSocket serverSocket = null;
	Socket socket = null;

	// 문자열 다루는 것
	PrintWriter writer = null;
	BufferedReader reader = null;
	String lineStr;

	public MakeServerSocket() { // 생성자
		try {
			serverSocket = new ServerSocket(1201); // 7777 <- 포트번호
			// 기다린다는 것을 코드 상으로 어떻게 표현하는가? while(true)
			while (true) {
				socket = serverSocket.accept(); // 실질적으로 클라이언트를 기다리는 부분(일단 멈춤)
				System.out.println("Client 요청됨");

				writer = new PrintWriter(socket.getOutputStream(), true); // 클라이언트로 보내는 쪽
				reader = new BufferedReader(new InputStreamReader(socket.getInputStream())); // 가져오는 쪽
				// 얘가 왔는거를 어떻게 알 수 있나?
				// while문으로 무한 루프돌려서 null이 아니면 무언가가 들어온 것
				while ((lineStr = reader.readLine()) != null) {
					writer.write(lineStr); // writer하게 되면 socket.getOutputStream()으로 들어가게 됨.소켓에 있는 상대편 스트림으로 들어감
					System.out.println("input : " + lineStr); // 이거 들어왔다 라고 그냥 보여주는 곳
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
		new MakeServerSocket();
	}
}
