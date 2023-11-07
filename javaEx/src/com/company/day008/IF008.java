package com.company.day008;

import java.util.Scanner;

public class IF008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		String str;
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("알파벳을 입력하시오 > ");
		str = sc.next();	
		char ch=str.charAt(0);
		
		//처리
		if( 'A'<= ch && ch <= 'Z' ) { System.out.println("대문자"); }
		
   else if( 'a'<= ch && ch <= 'z' ) { System.out.println("소문자"); }
      
		//출력
      	else{ System.out.println("알파벳아님"); }
				

	}

}
