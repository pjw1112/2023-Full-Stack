package com.company.day014;

public class Arr1Ex007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] su = { -3, 5, -1, -9, -7 };
		int rank = 1;

		for (int i = 0; i < su.length; i++) {
			if (su[4] < su[i]) {
				rank = rank + 1;
			}

		}

		System.out.println("su[4]요소의 등수 : " + rank);

	}

}
