package com.company.day017;

public class Arr2Ex002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3 }, { 4 } };

		for (int ch = 0; ch < arr.length; ch++) {
			for (int kan = 0; kan < arr[ch].length; kan++) {
				System.out.print(String.format("%d", arr[ch][kan]) + "\t");
			}
			System.out.println();
		}

	}

}
