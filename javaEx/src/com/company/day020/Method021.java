package com.company.day020;

import java.util.Arrays;

public class Method021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] num = { { 1, 3, 5 }, { 2, 4, 6 } };
		print(num);
		System.out.println("mail에서 주소확인"+System.identityHashCode(num));
		System.out.println("main : " + Arrays.deepToString(num));
	}


	
	static void print(int[][] num) {
		
		for(int i=0; i<num.length;i++) {
			for(int j=0; j<num[i].length;j++) {
				num[i][j]+=10;
			}
		}
		
		
		
		System.out.println(Arrays.toString(num[0]));
		System.out.println(Arrays.toString(num[1]));
	}
	
}
