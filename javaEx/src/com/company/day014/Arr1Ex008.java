package com.company.day014;

public class Arr1Ex008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] su = { -3, -5, -1, -9, -7 };
		int max = -99999, min = 99999;

		for (int i = 0; i < su.length; i++) {
			if (su[i] > max) {
				max = su[i];
			} else if (su[i] < min) {
				min = su[i];
			}

		}
		System.out.println("최대값 : " + max + " , 최소값 : " + min);
		
		
		for (int i : su) {
			if (i > max) {
				max = i;
			} else if (i < min) {
				min = i;
			}

		}
		System.out.println("최대값 : " + max + " , 최소값 : " + min);
		
		
		
		
		
		

	}

}
