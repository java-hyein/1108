
public class number {
	public static void main(String[] args) {
		
//		         1부터 100까지의 합                             
		
//		int sum = 0;
//		for(int j = 0; j <= 100; j++) {
//			sum += j;
//		}
//		System.out.println(sum + "\n");
		
//		1부터 100까지 중에 3의 배수
		
//		for (int i = 0; i <= 100; i++) {
//			if(i % 3 == 0 )
//			System.out.println(i);
//		}
////1부터 100까지의 홀수의 합
//		int odd = 0;
//		for (int i = 1; i <= 100; i++) {
//			if(i % 2 == 1) { // 홀수 조건
//				odd += i;
//			}
//		}
//		System.out.println(odd + "\n");
//		
////구구단 7단을 출력하시오
//		
//		int seven = 7;
//		for (int i = 1; i <= 10; i++) {
//			System.out.println(seven + " * " + i + " = " + (seven*i));
//		}
//		
//		int num = 1;
//		boolean search = false;
//		
//		while(num < 100) {
//			if((num % 5 == 0) && (num % 7 == 0)) {
//				search = true;
//				break;
//			}
//			num++;
//		}
//		if(search)
//			System.out.println("찾는 정수 : " + num);
//		else
//			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
//
//		int num = 1;
//		boolean search = true;
//
//		while (num < 100) {
//			if ((num % 5 == 0) && (num % 7 == 0)) {
//				break;
//			}
//			num++;
//		}
//		if (search)
//			System.out.println("찾는 정수 : " + num);
//		else
//			System.out.println("5의 배수이자 7의 배수인 수를 찾지 못했습니다.");
//
		int num = 0;
		int count = 0;
		while((num++) < 100) {
			if((num % 5 != 0) || (num % 7 != 0))
				continue;
			count++;
			System.out.println(num);
		}
		System.out.println("count : " + count);
	}

}
