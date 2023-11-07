package com.company.day015;

public class Arr2011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] num1 = new int[2][3];
		int ten = 1;
		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
//				num1[i][j] = 1;
//				
//				int tenten = j + 1 + i * num1[i].length;
//
//				for (int k = 1; k < tenten; k++) {
//					num1[i][j] *= 10;
//				}
				num1[i][j] = ten;
				ten *= 10;

			}

		}

		for (int i = 0; i < num1.length; i++) {
			for (int j = 0; j < num1[i].length; j++) {
				System.out.print(num1[i][j] + "\t");
			}

			System.out.println();

		}

	}

}
