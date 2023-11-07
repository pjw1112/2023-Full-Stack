package com.company.day014;

public class Arr1Ex006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] su = { -3, 5, -1, 9, -7 ,2, -11};
		int sum = 0;

		for (int i = 0; i < su.length; i++) {
			if (su[i] > 0 && su[i]%2!=0) {
				sum=sum+su[i];
			}

		}

		System.out.println("양수이면서 홀수의 합 : " + sum);

		
		
	}

}
