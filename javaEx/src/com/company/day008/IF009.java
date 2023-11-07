package com.company.day008;

import java.util.Scanner;

public class IF009 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳을 입력하시오 > ");
		str = sc.next();	
		char ch=str.charAt(0);
		
		if( 'A'<= ch && ch <= 'Z') {
				System.out.println("대문자"+ch+"소문자"+(char)(ch+32));
				
			}else if('a'<= ch && ch<='z'  ) {
				System.out.println("대문자"+(char)(ch-32)+"소문자"+ch);
			}else {
				System.out.println("알파벳아님");
			}
				

		
	}
}
