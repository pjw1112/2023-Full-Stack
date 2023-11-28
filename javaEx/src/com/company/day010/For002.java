package com.company.day010;

public class For002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i < 6; i++) {
			System.out.printf(i + "\t");
		}

		System.out.println();

		for (int i = 5; i > 0; i--) {
			System.out.printf(i + "\t");
		}
		System.out.println("안녕하세요 $번째입니다");
		System.out.println();

		for (int i = 1; i < 4; i++) {
			System.out.printf("java" + i + "\t");
		}

		System.out.println();

		for (int i = 3; i > 0; i--) {
			System.out.printf("happy" + i + "\t");
		}

		System.out.println();

		for (int i = 0; i < 3; i++) {
			System.out.printf(i + " ");
		}

		System.out.println();

		for (int i = 0; i < 100; i++) {
			System.out.printf(i + " ");
		}

		System.out.println();

		for (int i = 10; i > 0; i--) {
			System.out.printf(i + " ");
		}

		System.out.println();

		for (int i = 0; i < 10; i += 2) {
			System.out.printf(i + " ");
		}

		System.out.println();

		for (int i = 0, j = 0; i < 10; j = ++i) {
			System.out.printf(i + j + " ");
		}

	}

}
