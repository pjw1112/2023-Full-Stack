package com.company.day018;

import java.util.Scanner;

public class Method008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "", b = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("문자열 1>");
		a = scanner.next();
		System.out.println("문자열 2>");
		b = scanner.next();

		String res3 = max(a, b);

		System.out.println("최대값 : " + res3);

		scanner.close();
	}

	public static String max(String a, String b) {
		String max = "";
		max = a.concat(b);
		return max;
	}

}
