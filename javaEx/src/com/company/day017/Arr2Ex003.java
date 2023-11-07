package com.company.day017;

import java.util.Arrays;

public class Arr2Ex003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };
		int sum = 0;
		int count =0;
		double avg = 0.0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				sum=sum+arr[i][j];
				count++;
				
			}
		}

		avg=(double)sum/count;
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+avg);

		
		
	}

}
