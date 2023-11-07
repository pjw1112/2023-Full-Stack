package com.company.day021;

public class Method033 {

	
	static void test(int i) {
		if(i<0)return;
		System.out.print(i+"\t");
		test(--i);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test(10);
	}

}
