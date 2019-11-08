package day1107;

class SuperCLS {
	public SuperCLS() {
		System.out.println("I'm Super Class");
	}
}

class subCLS extends SuperCLS{
	public subCLS() {
		System.out.println("I'm Sub Class");
	}
}

class SuperSubCon{
	public static void main(String[] args) {
		new subCLS();
	}
}