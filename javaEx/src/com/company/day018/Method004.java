package com.company.day018;

public class Method004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1(10);
		test2(1.2);
		hap(3,5);
		disp(7,'*');
		disp(2,'@');
	}

	static void test1(int i) {
		System.out.println(i);
	}
	static void test2(double i) {
		System.out.println(i);
	}
	static void hap(int i,int j) {
		System.out.println(i+j);
	}
	static void disp(int i,char ch) {
		
		for(int m=0;m<i;m++) {
		System.out.print(ch);
		}
		System.out.println();
	}

}