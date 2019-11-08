package day1105;

public class ImmutableString {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if(str1.equals(str2)) {
			System.out.println("같은문자열");
		}
		
		if(str3.equals(str4)) {
			System.out.println("같다");
		}
		
//		if (str1 == str2) {
//			System.out.println("str1 and str2 은 동일 인스턴스 참조");
//		}else {
//			System.out.println("str1 and str2은 다른 인스턴스 참조");
//		}
//		
//		if(str3 == str4)
//			System.out.println("str1 and str2 은 동일 인스턴스 참조");
//		else 
//			System.out.println("str1 and str2 은 다른 인스턴스 참조");
	}

}
