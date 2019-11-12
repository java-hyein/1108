package day1111;

public class Print2 {
	interface Printable{
		void PrintLine(String str);
	}
	
	class SimplePrinter implements Printable{
		public void PrintLine(String str) {
			System.out.println(str);
		}
	}
	class MultiPrinter extends SimplePrinter{
		public void printLine(String str) {
			super.PrintLine("start if multi.....");
			super.PrintLine(str);
			super.PrintLine("end of multi.....");
		}
	}
}
