package com.company.day008;

import java.util.Scanner;

public class IF007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 년도 입력> ");
		year = sc.nextInt();
		
		if(year%4==0) {
			
			if((year%100 == 0) && !(year%400==0)) {
				str="평년";
			}else {
				str="윤년";
			}
			
		if(year%4==0 && year%100 == 0 && !(year%400==0) ) { str="윤년"; }
			
			
		}else {
			str="평년";
		}
		
		System.out.println(str);
		
		
		

	}

}
