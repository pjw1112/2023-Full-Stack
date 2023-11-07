package com.company.day006;

public class A005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(17<<32);
		System.out.println(16>>4);
		
		System.out.println(3<<2);
		
		int x = 2;
		System.out.println(1+x <<32);
		System.out.println( 1+x << 33 );
		System.out.println(Integer.toBinaryString(-6));
		System.out.println(Integer.toBinaryString(-6<<2));
		System.out.println(-6<<2);
		System.out.println();
		
		System.out.println(19<<3);
		System.out.println(-19>>>3);
		System.out.println(Integer.toBinaryString(-19));
		System.out.println(Integer.toBinaryString(-19>>3));
		System.out.println(Integer.toBinaryString(-19<<3));
		System.out.println();
		System.out.println(Integer.toBinaryString(19));
		System.out.println(Integer.toBinaryString(19>>3));
		System.out.println(Integer.toBinaryString(19<<3));
		System.out.println(-3<<30);
	}

}
