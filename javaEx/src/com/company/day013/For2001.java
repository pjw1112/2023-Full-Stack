package com.company.day013;

public class For2001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 눈에 보이는 그대로
		System.out.println("ver1. ");
		System.out.println("");
		System.out.println("["+1+"층]");
		System.out.println(1+"호실\t");
		System.out.println(2+"호실\t");
		System.out.println(3+"호실\t");
		System.out.println("");
		
		System.out.println("["+2+"층]");
		System.out.println(1+"호실\t");
		System.out.println(2+"호실\t");
		System.out.println(3+"호실\t");
		System.out.println("");
		
		
	
		// 2. for
		System.out.println("\n\nver2. ");
		System.out.println("");
		for(int j=1;j<3;j++) {
			System.out.println("["+j+"층]");
		for(int i=1;i<4;i++) {
			System.out.println(i+"호실\t");
		}
		System.out.println("");
		}
		
		
		
		
		
	}

}
