package day1105;

public class ImmutableString {

	public static void main(String[] args) {
		String str1 = "Simple String";
		String str2 = "Simple String";
		
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		if(str1.equals(str2)) {
			System.out.println("�������ڿ�");
		}
		
		if(str3.equals(str4)) {
			System.out.println("����");
		}
		
//		if (str1 == str2) {
//			System.out.println("str1 and str2 �� ���� �ν��Ͻ� ����");
//		}else {
//			System.out.println("str1 and str2�� �ٸ� �ν��Ͻ� ����");
//		}
//		
//		if(str3 == str4)
//			System.out.println("str1 and str2 �� ���� �ν��Ͻ� ����");
//		else 
//			System.out.println("str1 and str2 �� �ٸ� �ν��Ͻ� ����");
	}

}
