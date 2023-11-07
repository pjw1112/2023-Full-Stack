package com.company.day014;

public class Arr1Ex005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] su = { -3, 5, -1, 9, -7 };
		int sum = 0;

		for (int i = 0; i < su.length; i++) {
			if (su[i] < 0) {
				sum++;
			}

		}

		System.out.println("음수 개수 : " + sum);

	}

}
