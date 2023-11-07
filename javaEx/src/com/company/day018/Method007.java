package com.company.day018;

import java.util.Scanner;

public class Method007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 1>");
		a = scanner.nextInt();
		System.out.println("숫자 2>");
		b = scanner.nextInt();
		System.out.println("숫자 3>");
		c = scanner.nextInt();

		int res3 = max(a, b, c);

		System.out.println("최대값 : " + res3);
		scanner.close();
	}

	public static int max(int a, int b, int c) {
		int max = 0;
		max = (a > b ? a : b);
		max = (max > c ? max : c);

		return max;
	}

}
