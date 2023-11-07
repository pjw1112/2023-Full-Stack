package com.company.day008;

import java.util.Scanner;

public class IF012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fruit;
		char fruit_c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 하나를 입력하세요 >");
		
		fruit = sc.next();
		fruit_c = fruit.charAt(0);
		
			 if( fruit_c=='a' || fruit_c=='A' ) { fruit= "apple"; }
		
		else if( fruit_c=='b' || fruit_c=='B' ) { fruit= "banana"; }
			 
		else if( fruit_c=='c' || fruit_c=='C' ) { fruit= "coconut"; }
			 		
			 System.out.println(fruit_c+" 로 시작하는 과일은 "+fruit+" 입니다.");
		
	}

}
