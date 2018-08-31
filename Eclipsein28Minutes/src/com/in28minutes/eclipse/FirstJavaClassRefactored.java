package com.in28minutes.eclipse;

import java.math.BigDecimal;

public class FirstJavaClassRefactored {

	private static final double PI = 3.14;
	private static BigDecimal bigDecimal;

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;
		sum = calculateSumforNNumbers(numbers, sum);
		int radius = 5;
		double area = PI * radius * radius;
		System.out.println("Area is " + area);
		System.out.println(sum);
	}

	private static int calculateSumforNNumbers(int[] numbers, int dummy) {
		for (int number : numbers) {
			dummy += number;

		}
		return dummy;
	}

}
