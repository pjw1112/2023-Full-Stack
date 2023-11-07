package com.company.day013;

public class For2Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for
		for (int n = 1; n < 27; n++) {
			for (int m = 0; m < n; m++) {
				System.out.print((char) (m + 65));
			}
			System.out.println();
		}

		// while
		int n = 1;
		while (n < 27) {
			int m = 0;
			while (m < n) {
				System.out.print((char) (m + 65));
				m++;
			}
			System.out.println();
			n++;
		}

		// do while
		n = 1;
		do {
			int m = 0;
			do {

				System.out.print((char) (m + 65));
				m++;
			} while (m < n);
			System.out.println();
			n++;
		} while (n < 27);

	}

}
