package com.company.day007;

public class A009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1, b=5, c=3, max;
		
//		max = ((a>b ? a : b) > c ? (a>b ? a : b) : c );
//		System.out.println(max);
//		기능하지만 가독성 안 좋음
		
		max = a>b ? a:b ;	
		max = max > c ? max : c ;
		System.out.println(max);
		
	}

}
