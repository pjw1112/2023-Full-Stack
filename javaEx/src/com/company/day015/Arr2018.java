package com.company.day015;

public class Arr2018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] fl1 = new float[2][3];

		for (int i = 0; i < fl1.length; i++) {
			for (int j = 0; j < fl1[i].length; j++) {
				fl1[i][j] = (float) (1 + 0.1 * (j + 1 + i * fl1[i].length));
			}

		}
		for (int i = 0; i < fl1.length; i++) {
			for (int j = 0; j < fl1[i].length; j++) {
				System.out.print(fl1[i][j] + "\t");
			}

			System.out.println();

		}
	}

}
