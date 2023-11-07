package com.company.day013;

public class For2Ex006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 2; i < 10; i=i+3) {

			for (int j = 1; j < 2; j++) {

				for (int k = 1; k < 4; k++) {
					System.out.print(i + " x " + k + " = " + k * j*i + "\t");
					System.out.print((i+1) + " x " + k + " = " + (k+1) * j*i + "\t");
					System.out.print((i+2) + " x " + k + " = " + (k+2) * j*i+"\n");

				}
				System.out.println();
			}
		}
		
		
		
		
		
	}

}
