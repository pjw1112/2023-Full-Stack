package com.company.day019;

import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		for (;;) {

			System.out.println("입력 > ");
			char c = scan.next().charAt(0);

			if (c == '+' || c == '-' || c == '/' || c == '*') {
				System.out.println("조건 만족 - 종료");
				break;
			}

		}

		
		
		
		while(true) {

			System.out.println("입력 > ");
			char c = scan.next().charAt(0);

			if (c == '+' || c == '-' || c == '/' || c == '*') {
				System.out.println("조건 만족 - 종료");
				break;
			}

		}

		
		

		do{

			System.out.println("입력 > ");
			char c = scan.next().charAt(0);

			if (c == '+' || c == '-' || c == '/' || c == '*') {
				System.out.println("조건 만족 - 종료");
				break;
			}

		}while(true);
		
		
		
		
		
		
		int[][] inin = new int[2][3];
		
		for(int i=0;i< inin.length;i++) {
			for(int j=0;j< inin[i].length;j++) {
				
			inin[i][j]=((i+1)*100)+(j+1);
			}
			
		}
		
		for(int i=0;i< inin.length;i++) {
			for(int j=0;j< inin[i].length;j++) {
				System.out.print(inin[i][j]+"\t");
			}
			System.out.println();
		}
		
		
		
		dog();
		
		
		disp(7,'*');
		
		System.out.println("당신의 학번은?");
		
		
		
		
	}

	static void dog() {
		System.out.println("멍멍");
	}
	static void disp(int i, char c) {
		for(int j=0;j<i;j++) {
			System.out.print(c);
		}
		System.out.println();
	}
	
	
	
}
