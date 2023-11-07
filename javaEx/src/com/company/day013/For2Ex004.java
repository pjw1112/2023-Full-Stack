package com.company.day013;

public class For2Ex004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for
		System.out.println("for================================");
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			sum = 0;
			for (int j = 1; j < 11; j++) {

				System.out.print(j + (i * 10) + " ");

				if (j < 10) {
					System.out.print("+ ");
				}
				sum = sum + j + (i * 10);

				if (j == 10) {
					System.out.println(" = " + sum);
				}
			}
			System.out.println();
		}

		// while
		System.out.println("while================================");
		sum = 0;
		int i = 0;
		while (i < 10) {
			sum = 0;
			int j = 1;
			while (j < 11) {

				System.out.print(j + (i * 10) + " ");

				if (j < 10) {
					System.out.print("+ ");
				}
				sum = sum + j + (i * 10);

				if (j == 10) {
					System.out.println(" = " + sum);
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
		
		
		// do while
				System.out.println("do-while================================");
				sum = 0;
				i = 0;
				do{
					sum = 0;
					int j = 1;
					do{

						System.out.print(j + (i * 10) + " ");

						if (j < 10) {
							System.out.print("+ ");
						}
						sum = sum + j + (i * 10);

						if (j == 10) {
							System.out.println(" = " + sum);
						}
						j++;
					}while (j < 11);
					System.out.println();
					i++;
				}while (i < 10);

	}

}
