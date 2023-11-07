package com.company.day007;

import java.util.Iterator;

public class A007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//#1. 삼항 연산자
		// (조건) ? 참 : 거짓
		System.out.println("#1. 삼항연산자");
		int a = 10;
		String str = a>-1 ? "양수" : "음수";
		System.out.println(str);
		
		int v1= 3>a ? 3:a;
		System.out.println(v1);
		
		
		//#2. 대입 연산자
		int v2,b2;
		v2=10; b2=10;
		v2+=3; b2=b2+3;
		System.out.println(v2+","+b2);
		v2*=3; b2=b2*3;
		System.out.println(v2+","+b2);
		v2-=3; b2=b2-3;
		System.out.println(v2+","+b2);
		v2/=3; b2=b2/3;
		System.out.println(v2+","+b2);
		

		
		
	}

}
