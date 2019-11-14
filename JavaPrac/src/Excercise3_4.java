//아래는 변수 의 값 중에서 백의 자리 이하를 버리는 코드이다 만일 변수 num의 값이 ‘456’이라면  ‘400’이 되고 , ‘111’ 이라면‘100’이 된다 
//(1)에 알맞은 코드를 넣으시오.

public class Excercise3_4 {

	public static void main(String[] args) {
		int num = 456;
		System.out.println(456-456 % 100);
	}
}

//456 % 100 = 56;
//456-56 = 100;