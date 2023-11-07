package com.company.day010;

public class For011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		for (char ch = 'A'; ch <= 'Z'; ch++) {

			System.out.printf("%s", ch);

			i++;

			if (i % 5 == 0) {
				System.out.println();
			}

		}
	}

}
