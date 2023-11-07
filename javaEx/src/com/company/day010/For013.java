package com.company.day010;

import java.util.Scanner;

public class For013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. break 예문
		for(int i=1; i<11; i++) {
			if(i==5) { break; }
			System.out.println(i + "\t");
			
		}
		
		System.out.println();
		
		//2. continue 예문
		for(int i=1; i<11; i++) {
			if(i==5) { continue; }
			System.out.println(i + "\t");
			
		}
		System.out.println();
		Scanner sc = new Scanner(System.in);
		
		//3. 무한반복 for
		char loop='\u0000';
		
		for(;;) {
			System.out.println("hello");
			System.out.println("continue?");
			loop=sc.next().charAt(0);
			if(loop=='x') {break;
			
			}
			
		}
		
		//4. 1을 입력할때까지 무한반복
		int i=0;
		for(;;) {
			System.out.println("1을 입력할때까지 무한반복");
			System.out.println("입력 > ");
			i=sc.nextInt();
			if(i==1) {break;
			
			}
			
		}
		
		
	}

}
