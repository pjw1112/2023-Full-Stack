package com.company.day007;

import java.util.Scanner;

public class A010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 한 개 입력 > ");
		a=sc.nextInt();
		System.out.println("입력한 값 : "+a);
		a = a>0 ? a:-a;
		System.out.println("절대 값 : "+a);
		
		
	}

}
