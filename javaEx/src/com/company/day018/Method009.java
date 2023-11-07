package com.company.day018;

import java.util.Scanner;

public class Method009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Double a = 0.0, b = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열 1>");
		a = scanner.nextDouble();
		System.out.println("문자열 2>");
		b = scanner.nextDouble();

		Double res3 = max(a, b);

		System.out.println("최대값 : " + res3);

		scanner.close();
	}
	public static Double max(Double a, Double b) {
		Double max = 0.0;
		max = a+b;
		return max;
	}

}
