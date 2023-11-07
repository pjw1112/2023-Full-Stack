package com.company.day008;

import java.util.Scanner;

public class IF002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("평균을 입력하시오> ");
		i = sc.nextInt();
		
		if (i < 60) { System.out.printf("불");}
		
		System.out.printf("합격");
		sc.close();
		
	}

}
