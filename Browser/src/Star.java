import java.io.*;
class Star {
	public static void main(String[] args) throws Exception {
		System.out.println("");
		for(int i = 1; i <= 5; i++){
			for(int j = 1;j <= i; j++){
			System.out.print("*");
			}
				System.out.println("");
		}
	}
}