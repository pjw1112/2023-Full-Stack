package com.company.day016;

public class Array2022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num1 = new int[5][5];

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				num1[i][j] = j + 1 + i * num1[i].length;
			}

		}
		for (int i = 0; i < num1.length; i++) {

			for (int j = 0; j < num1[i].length; j++) {

				if (i % 2 == 0) {

					System.out.print(num1[i][j] + "\t");

				} else if (i % 2 != 0) {

					System.out.print(num1[i][4 - j] + "\t");

				}

			}

			System.out.println();

		}

	}

}
