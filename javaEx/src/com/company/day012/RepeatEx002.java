package com.company.day012;

public class RepeatEx002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for 버전
		int i = 1, j = 2, sum = 0;
		for (j = 2; j < 12; j++) {

			for (i = 1; i < j; i++) {
				if (i == 1) {
					System.out.printf("(");
				}
				System.out.printf(i + "");
				if (j - i > 1) {
					System.out.printf("+");
				}
				if (j - i == 1) {
					System.out.printf(")");

				}
				sum = sum + i;
			}
			if (i == j && j < 11) {
				System.out.printf("+");
			}

		}
		System.out.printf(" = %d ", sum);
		System.out.println();

		// while 버전
		i = 1;
		j = 2;
		sum = 0;
		while (j < 12) {
			i = 1;
			while (i < j) {
				if (i == 1) {
					System.out.printf("(");
				}
				System.out.printf(i + "");
				if (j - i > 1) {
					System.out.printf("+");
				}
				if (j - i == 1) {
					System.out.printf(")");

				}
				sum = sum + i;
				i++;
			}
			if (i == j && j < 11) {
				System.out.printf("+");
			}
			j++;
		}
		System.out.printf(" = %d ", sum);
		System.out.println();

		// do-while 버전
		i = 1;
		j = 2;
		sum = 0;
		do {
			i = 1;
			do {
				if (i == 1) {
					System.out.printf("(");
				}
				System.out.printf(i + "");
				if (j - i > 1) {
					System.out.printf("+");
				}
				if (j - i == 1) {
					System.out.printf(")");

				}
				sum = sum + i;
				i++;
			} while (i < j);
			if (i == j && j < 11) {
				System.out.printf("+");
			}
			j++;
		} while (j < 12);
		System.out.printf(" = %d ", sum);

	}

}
