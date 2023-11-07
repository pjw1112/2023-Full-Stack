package com.company.day008;

import java.util.Scanner;

public class IF005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 1개를 입력하시오> ");
		i = sc.nextInt();
		
		if (i < 0) {
			System.out.printf("%d 절대값 %d", i, -i);
		}else {
			System.out.printf("%d 절대값 %d", i, i);
		}
		
	
	}

}
