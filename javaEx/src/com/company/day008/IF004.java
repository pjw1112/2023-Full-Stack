package com.company.day008;

import java.util.Scanner;

public class IF004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("1,2,3중 좋아하는 숫자를 입력하시오> ");
		i = sc.nextInt();
		
		if (i == 1) {
			System.out.printf("ONE");
		}
		else if(i == 2) {
			System.out.printf("TWO");
		}
		else if(i == 3) {
			System.out.printf("THREE");
		}
		else {
			System.out.printf("1,2,3이 아니다");
		}
	
	}

}
