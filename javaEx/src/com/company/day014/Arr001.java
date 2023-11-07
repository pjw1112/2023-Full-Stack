package com.company.day014;

import java.util.Arrays;

public class Arr001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = null;
		int[] arr1 = { 1, 2, 3 };

		System.out.println(arr);
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));

		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);

	}

}
/*
 * Arr001.java <--- cnd) javac Arr001.java Arr001.class <--- cnd) java Arr001
 * =============================================RUNTIME DATA AREA 1. 메서드 - 코드분석
 * ( class Arr001 ) ============================================= 2. HEAP 3.
 * Stack {1,2,3} [arr1/heap주소]
 * 
 */
