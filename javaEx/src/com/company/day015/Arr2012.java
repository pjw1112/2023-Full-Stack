package com.company.day015;

public class Arr2012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] da1 = new int[2][3];

		for (int i = 0; i < da1.length; i++) {
			for (int j = 0; j < da1[i].length; j++) {
				da1[i][j] = 10 + (j + 1 + i * da1[i].length);
			}

		}
		for (int i = 0; i < da1.length; i++) {
			for (int j = 0; j < da1[i].length; j++) {
				System.out.print(da1[i][j] + "\t");
			}

			System.out.println();

		}

	}

}
