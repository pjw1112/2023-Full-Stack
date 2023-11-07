package com.company.day013;

public class For2Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for
		for (int i = 1; i < 27; i++) {

			for (int j = 1; j < 28 - i; j++) {
				System.out.print((char) (j + 64));
			}
			System.out.println();
		}

		// while
		int i = 1;
		while (i < 27) {
			int j = 1;
			while (j < 28 - i) {
				System.out.print((char) (j + 64));
				j++;
			}
			System.out.println();
			i++;
		}

		// do while
		i = 1;
		while (i < 27) {
			int j = 1;
			while (j < 28 - i) {
				System.out.print((char) (j + 64));
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
	}

}
