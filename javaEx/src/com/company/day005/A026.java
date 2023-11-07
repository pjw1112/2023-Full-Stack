package com.company.day005;

import java.util.Scanner;

public class A026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str;
		char chr;
		System.out.println("당신의 이름을 입력하시오 >");
		str = sc.next();
		System.out.println("당신의 반을 입력하시오(A/B)");
		chr = sc.next().charAt(0);
		
		System.out.println("::::::::::::::::::::::::::::::USERINFO");
		System.out.println(":: NAME : "+str);
		System.out.println(":: CLASS : "+chr);
		
		
	}

}
