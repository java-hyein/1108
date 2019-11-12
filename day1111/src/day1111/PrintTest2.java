package day1111;

import day1111.Print2.Printable;

public class PrintTest2 {

	public static void main(String[] args) {
		Printable prn1 = new SimplePrinter();
		Printable prn2 = new MultiPrinter();
		
		if(prn1 instanceof Printable)
			prn1.PrintLine("this is a simple printer");
		System.out.println();
		
		if(prn2 instanceof Printable)
			prn1.PrintLine("this is a MulifulPrinter printer");
	}

}
