package com.company.day010;

public class For007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 0;
		for (int i = 1; i <= 30; i++) {

			if (i % 3 == 0 && i % 2 == 0) {
				System.out.println("3의 배수이면서 2의 배수인 숫자 : " + i);
				j++;
			}
		}

		System.out.println("갯수 : " + j);
	}

}
