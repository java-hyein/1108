package day1105;

public class StringConcat {

	public static void main(String[] args) {
//		String st1 = "Coffee";
//		String st2 = "Bread";
//		
//		String st3 = st1.concat(st2);
//		System.out.println(st3);
//		
//		String st4 = "Fresh".concat(st3);
//		System.out.println(st4);
//		
//		String str  ="abcdefg";
//		str.substring(2,4);
		
		String st1 = "Lexicographically";
		String st2 = "lexicographically";
		
		int cmp;
		
		if(st1.equals(st2))
		System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
		
		cmp = st1.compareTo(st2);
		if(cmp == 0) 
			System.out.println("�� ���ڿ��� ��ġ�մϴ�.");
		else if (cmp < 0)
			System.out.println("������ �տ� ��ġ�ϴ� ���� : " + st1);
		else
			System.out.println("������ �տ� ��ġ�ϴ� ���� : " + st2);
		
		if(st1.compareToIgnoreCase(st2)==0)
		System.out.println("�� ���ڿ��� �����ϴ�.");
		else
			System.out.println("�� ���ڿ��� �ٸ��ϴ�.");
	}

}
