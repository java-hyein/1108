package day1111;

public class Print {
	interface Printable {
		void print(String doc);
	}
	
	interface ColorPrintable extends Printable{
		void printCMYK(String doc);
	}
	
	class Prn99Drv implements ColorPrintable{
		@Override
		public void print(String doc) {
			System.out.println("black & white ver");
			System.out.println(doc);
		}
		@Override
		public void printCMYK(String doc) {
			System.out.println("CMYK ver");
			System.out.println(doc);
		}
	}
}
