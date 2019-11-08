
public class question {
	public static void printStar(int end) {
		for(int i =1; i<=end; i++) {
			for(int j =1 ; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		printStar(5);
	}

}
