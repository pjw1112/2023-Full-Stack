package com.company.day021;

public class Method031_self {

	public static void test (int a) {
		
		System.out.println("test --- start!"+a);
		
		if(a<1)return; 
		
		System.out.print(a+"\t");
		
		System.out.println("test --- end!"+a);
		test(--a);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main --- start!");
		test(3);
	}

}
