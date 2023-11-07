package com.company.day009;

import java.util.Scanner;

public class Switch005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		char fruit;
		String fruit2="";
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("문자 1개 입력 >");
		fruit = sc.next().charAt(0);
		
		//처리		
		if( 65<= fruit && fruit <= 67 ) {fruit+=32;}
		// 입력받은 문자 변수 값이 65,66,67 일 경우 +32 (소문자로 바꿈)
		
		switch(fruit) { 
		  case 'a' : fruit2="APPLE"; break;
		  case 'b' : fruit2="BANANA"; break;
		  case 'c' : fruit2="COCONUT"; break;
		  
		}	
		
		//출력
		System.out.println(fruit2);
		sc.close();
		
	}

}
