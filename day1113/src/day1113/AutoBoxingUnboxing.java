package day1113;

import java.math.BigDecimal;
import java.util.Random;

public class AutoBoxingUnboxing {

	public static void main(String[] args) {
//		Integer iObj = 10;
//		Double dObj = 3.14;
//		
//		int num1 = iObj;
//		double num2 = dObj;
//
//		Integer num1 = new Integer(29);
//		System.out.println(num1.intValue());
//		System.out.println(num1.doubleValue());
//		
//		Double num2 = new Double(3.14);
//		System.out.println(num2.intValue());
//		System.out.println(num2.doubleValue());
//		
//		Integer n1 = Integer.valueOf(5);
//		Integer n2 = Integer.valueOf("1024");
//		
//		System.out.println("큰수 : "+ Integer.max(n1, n2));
//		System.out.println("작은 수 : "+ Integer.min(n1, n2));
//		System.out.println("합 : "+ Integer.sum(n1, n2));
//		System.out.println();
//		
//		System.out.println("12의 2진 표현 : " +Integer.toBinaryString(12));
//		System.out.println("12의 8진 표현 : " +Integer.toOctalString(12));
//		System.out.println("12의 16진 표현 : " +Integer.toHexString(12));
//
//		BigDecimal d1 = new BigDecimal("1.6");
//		BigDecimal d2 = new BigDecimal("0.1");
//		System.out.println("덧셈 결과 : " + d1.add(d2));
//		System.out.println("덧셈 결과 : " + d1.multiply(d2));
//		
//		System.out.println("원주율 : " + Math.PI);
//		System.out.println("제2제곱근 : " + Math.sqrt(2));
//		System.out.println();
//		System.out.println("파이에 대한 Degree : " + Math.toDegrees(Math.PI));
//		System.out.println("2 파이에 대한 Degree : " + Math.toDegrees(2.0 * Math.PI));
//		System.out.println();
//		
//		double radian45 = Math.toRadians(45);
//		System.out.println("싸인 45 : " + Math.sin(radian45));
//		System.out.println("코싸인 45 : " + Math.cos(radian45));
//		System.out.println("탄젠트 45 : " + Math.tan(radian45));
//		System.out.println();
//		System.out.println("로그 25 : " + Math.log(25));
//		System.out.println("2 의 16승 : " + Math.pow(2,16));
//		System.out.println();
//		
		Random rand = new Random();
		for (int i = 0; i < 7; i++)
			System.out.println(rand.nextInt(1000));

		System.out.println("------------------------------------");
		Random rand1 = new Random(12);
		for (int i = 0; i < 7; i++)
			System.out.println(rand1.nextInt(1000));
	}

}
