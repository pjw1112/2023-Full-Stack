package com.company.day020;

import java.util.Arrays;

public class Method018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3};
		System.out.println("1. arr의 보관은 주소 > "+arr);
		
		System.out.println("2. arr[0] > "+arr[0]);
		
		System.out.println("STEP2) call by value");
		System.out.println(cv(1)); //해당값 리턴
		System.out.println(Arrays.toString(arr));
		System.out.println(cv(arr[0]+1));
		System.out.println(Arrays.toString(arr));
		System.out.println(cv(arr[0]++));
		System.out.println(Arrays.toString(arr));
		
	}
	
	static int cv(int i) {
		return i;
	}
	
	
	
	
}
