package com.company.day008;

import java.util.Scanner;

public class IF003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오> ");
		i = sc.nextInt();
		
		if (i < 0) {
			System.out.printf("음수");
		}
		else if(i>0) {
			System.out.printf("양수");
		}
		else {
			System.out.printf("제로");
		}
		
	

		
	}

}
