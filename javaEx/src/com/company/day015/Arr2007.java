package com.company.day015;

public class Arr2007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] ch1 = new char[2][3];
		char aaa = 'A';
		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1[i].length; j++) {
				ch1[i][j] = (char) (aaa + j);

				if (i % 2 != 0) {
					ch1[i][j] += 32;
				}

			}

		}

		for (int i = 0; i < ch1.length; i++) {
			for (int j = 0; j < ch1[i].length; j++) {
				System.out.print(ch1[i][j] + "\t");
			}

			System.out.println();

		}

	}

}
