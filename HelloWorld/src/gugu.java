
public class gugu {
	public static void printGuGu(int start, int end) {
		int temp;
		if(start > end) {
			temp = start;
			start = end;
			end = temp;
		}
		for(int i = start; i <= end; i++) {
			for(int j = 1; j<=9; j++){
				System.out.println(i*j);
			}
		}

	}

	public static void main(String[] args) {
		printGuGu(9,1);		

	}

}
