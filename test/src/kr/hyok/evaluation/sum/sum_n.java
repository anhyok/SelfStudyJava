package kr.hyok.evaluation.sum;

import java.util.Scanner;

public class sum_n {

	public static void main(String[] args) throws Exception {
		System.out.print("? ");
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int sum = 0;
		for(int i = 1; i <= n; i++)
//			if(i%2 == 0) // even
//			if(i%2 != 0) // odd
			sum = sum + i;
		System.out.println(sum);
	}

}
