package com.company.day009;

import java.util.Scanner;

public class Switch006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		int num, num2;
		String suwoomi="";
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("평균을 입력하시오 > ");
		num = sc.nextInt();
		
		//처리
		num2=num/10;
		
		switch(num2) {
		
		case 10 : case 9 : suwoomi="수"; break;
		
		case 8  : suwoomi="우"; break;
		
		case 7  : suwoomi="미"; break;
		
		case 6  : suwoomi="양"; break;
		
		default : suwoomi="가"; break;
		
		}
		
		
		//출력
		System.out.println(suwoomi);
		sc.close();
		
		
	}

}
