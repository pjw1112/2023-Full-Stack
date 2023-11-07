package com.company.day009;

import java.util.Scanner;

public class Switch003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수		
		char fruit;
		String fruit2="";
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("a,b,c 중에 문자 1개 입력 >");
		fruit = sc.next().charAt(0);
		
		//처리
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
