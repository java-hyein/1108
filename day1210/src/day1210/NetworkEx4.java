package day1210;

import java.io.*;
import java.net.*;

public class NetworkEx4 {
	public static void main(String[] args) {
		URL url = null;
		BufferedReader input = null;
		String address = "http://www.naver.com";
		String line="";		
		try {
			url = new URL(address);
			input = new BufferedReader(new InputStreamReader(url.openStream()));
										// 지금 서버에 있는걸 다 읽는다 // 이미지가 아니라 텍스트만 가져온다
			//텍스트를 그리는 주체는 웹 브라우져이다.
			while((line=input.readLine()) != null) {
						// 한줄 한줄 읽는다
				System.out.println(line);
			}
			input.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
