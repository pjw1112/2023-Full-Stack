package com.company.day005;

import java.util.Scanner;

public class A024 {
	public int nam=100;
	protected static int ayo=1;
	public int ho =5;
	protected void ayo1() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("1. abc를 입력해주세요.");
		char ch ='a';
		str= sc.next();
		
		System.out.println("입력한 값 >"+ str);
		System.out.println("첫번째 문자 > "+ str.charAt(0));
		System.out.println("두번째 문자 > "+ str.charAt(1));
		System.out.println("세번째 문자 > "+ str.charAt(2));
		
		System.out.println("2. 타입을 선택해주세요! (A/B)");
		ch= sc.next().charAt(0);
		System.out.println(str+"타입");
		
		
		
	}

}
