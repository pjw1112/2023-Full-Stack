package com.company.day010;

public class For006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j = 0;
		for (int i = 1; i <= 10; i++) {

			if (i % 3 == 0) {
				j = j + i;
			}
		}

		System.out.println("1~10까지 3의 배수인 숫자들의 합 : " + j);

	}

}
