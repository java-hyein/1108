//369게임 짜기
// 어떤 수가 369라는 숫자를 포함한  갯수를 센다.
// int find369(int number);
// 자릿수를 알수 없는 큰 숫자에 숫자 하나하나를 다룰때 알아야하는 코드
public class Game {
	public static int find369(int number) {// 수를 받아오기 위해 - 아래 i의 값이 int number에 들어옴
		int count = 0;
		while (number > 0) {  // 0보다 작은 수가 들어올 수도 있다
			int temp = number % 10;  //현재 1의 자리에 숫자가 3,6,9 인지 확인 한자리수 분리
			if(temp == 3 || temp == 6 || temp == 9)
				count++;
				number /=10; //한자리씩 줄인다(100,1000,10000이 들어올지 모르니까) 나누기 연산자 
		}
		return count;
	}
	
	public static void main(String[] args) {
		for(int i = 1; i <= 100; i++) { 
			int count = find369(i);
				System.out.format("%d :", i);
			for(int j = 0; j < count; j++) {
				System.out.print("짝");
			}
			System.out.println(" ");
		}
	}

	
//	public static void main(String[] args) {
//		
//		//int find369;
//			for(Integer i = 1; i <= 100; i++) {
//				if(i.toString().indexOf('3') < 0)
//				if(i.toString().indexOf('6') < 0)
//				if(i.toString().indexOf('9') < 0)
//					continue;
//				System.out.format("%d\n", i);
//				
//			}
//	}
}
