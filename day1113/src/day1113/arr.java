package day1113;

import java.util.Arrays;

public class arr {
	public static void main(String[] args) {
		double[] org = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		double[] cpy = new double[3];

		System.arraycopy(org, 1, cpy, 0, 3);
		for (double d : cpy)
			System.out.print(d + "\t");
		//System.out.println(Arrays.toString(org));
		//°á°ú°ª :  [1.1, 2.2, 3.3, 4.4, 5.5]
		System.out.println();
	}

}
