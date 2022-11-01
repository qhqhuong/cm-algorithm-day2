package algorithm;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Type number: ");

		int number = input.nextInt();
		int fibo = findFibonacci(number);

		System.out.println(fibo);
		input.close();
	}

	public static int findFibonacci(int number) {

		if (number <= 1)
			return number;

		int[] fibo = new int[number + 1];
		fibo[0] = 0;
		fibo[1] = 1;

		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 1] + fibo[i - 2];
		}
		return fibo[number];

	}
}

// Time complexity -> O(n)
