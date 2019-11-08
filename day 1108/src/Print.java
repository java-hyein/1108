
	interface Printable{
		public void print(String doc);
	}
	class SPrinterDriver implements Printable{
		@Override
		public void print(String doc) {
			System.out.println("FROM samsung Printer");
			System.out.println(doc);
		}
	}
	class LPrinterDriver implements Printable{
		@Override
		public void print(String doc) {
			System.out.println("From LG Printer");
			System.out.println(doc);
		}
	}

