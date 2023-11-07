package com.company.day019;

import java.util.Scanner;

public class Method012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y;
		double z = 0.0;
		String result1 = "";
		char ch;

		System.out.println("1. 정수를 하나 입력해주세요. > ");
		x = sc.nextInt();

		System.out.println("2. 정수를 하나 입력해주세요. > ");
		y = sc.nextInt();

		System.out.println("3. 연산자를 입력해주세요. ( +, -, *, / ) > ");
		ch = sc.next().charAt(0);

		result1 = calc(x, y, ch);
		show(x, y, ch, result1);

		sc.close();

	}

	static String calc(int x, int y, char ch) {
		String result = "";
		double z = 0;
		if (ch == '+') {
			z = x + y;
			result = Integer.toString((int) z);
		}

		else if (ch == '-') {
			z = x - y;
			result = Integer.toString((int) z);
		}

		else if (ch == '/') {
			z = (double) x / y;
			result = String.format("%.2f", z);
		}

		else if (ch == '*') {
			z = x * y;
			result = Integer.toString((int) z);
		}

		return result;
	}

	static void show(int x, int y, char ch, String result1) {
		System.out.println("" + x + ch + y + "=" + result1);
	}

}
