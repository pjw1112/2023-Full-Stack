package com.company.day014;

import java.util.Arrays;

public class Arr005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 2, 3 };

		int[] arr1 = new int[3];
		System.out.println(arr1);
		System.out.println(Arrays.toString(arr1));

		//2. 값 대입부분 for 로 줄이기
		for (int i = 0; i < arr.length; i++) {

			arr[i] = (i + 1) * 10;
		}

		//3. for로 출력
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);
		}

		
		
		
	}

}
