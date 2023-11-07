package com.company.day013;

public class For2008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int n = 1; n < 5; n++) {
			for (int m = 1; m < 5; m++) {

				if (m == n) {
					System.out.print("@");
				} else {
					System.out.print("#");
				}

			}
			System.out.println();
		}

	}

}
