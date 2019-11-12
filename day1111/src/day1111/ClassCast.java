package day1111;

class Board {
}

class PBoard extends Board {
}

public class ClassCast {
	public static void main(String[] args) {
		Board pbd1 = new PBoard();
		PBoard pbd2 = (PBoard) pbd1;

		System.out.println("악하하");
		Board ebd1 = new Board(); //new를 하고 나서야 얘를 알 수 있으니까 
		PBoard ebd2 = (PBoard) ebd1; //빨간 줄을 안띄운다. 
	}
}