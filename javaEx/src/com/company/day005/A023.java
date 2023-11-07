package com.company.day005;

import java.util.Scanner;

public class A023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//#1. 문자 초기화
		char ch1=' ';
		char ch='\u0000';
		ch = 'A';  // 저장시에는 숫자/ 출력은 문자
		System.out.println(ch);
		System.out.println((int)ch);
		
		
		System.out.println((char)(ch++));  //A++ ,  문자 1개 증가,  B
		//#2. 문자의 연산 ( int보다 작은 형 - byte, short, char )
		System.out.println(ch);  //66
		//ch + 1
		// 'A' + 1
		// 'A'(char) + 1(int)
		// 'A'(int:65) + 1(int) 의 결과물은 int
		
		
		
		//#3. 문자 - Scanner로 입력 받기
		
		Scanner scan = new Scanner(System.in);
		
		String str = "abc"; 
		str = "ab";
		str = "a";
		str ="";
		str="abcd";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
		
		System.out.println("문자열(String) 입력 > ");
		str = scan.next();
		System.out.println("입력한 문자열 : "+ str);
		System.out.println("문자열의 첫번째 문자 : "+ str.charAt(0));
		
		
		
	} // end main

} // end class
