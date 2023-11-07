package com.company.day010;

public class For008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {

				j = j + i;
			}

		}

		System.out.println("짝수의 합 : " + j);
	}

}
