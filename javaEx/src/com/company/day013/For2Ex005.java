package com.company.day013;

public class For2Ex005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for
		System.out.println("for================================");
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum = 0;
			for (int j = 1; j <= (i * 10); j++) {

				System.out.print(j + "");

				if (j < (i * 10)) {
					System.out.print("+");
				}
				sum = sum + j;

				if (j == (i * 10)) {
					System.out.println("=" + sum);
				}
			}
			System.out.println();
		}

		// while
		System.out.println("while================================");
		sum = 0;
		int i = 1;
		while (i < 11) {
			sum = 0;

			int j = 1;
			while (j <= (i * 10)) {

				System.out.print(j + "");

				if (j < (i * 10)) {
					System.out.print("+");
				}
				sum = sum + j;

				if (j == (i * 10)) {
					System.out.println("=" + sum);
				}
				j++;
			}
			System.out.println();
			i++;
		}

		// do-while
		System.out.println("do-while================================");
		sum = 0;
		i = 1;
		do {
			sum = 0;

			int j = 1;
			do {

				System.out.print(j + "");

				if (j < (i * 10)) {
					System.out.print("+");
				}
				sum = sum + j;

				if (j == (i * 10)) {
					System.out.println("=" + sum);
				}
				j++;
			} while (j <= (i * 10));
			System.out.println();
			i++;
		} while (i < 11);

	}

}
