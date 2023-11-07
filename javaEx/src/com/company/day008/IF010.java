package com.company.day008;

import java.util.Scanner;

public class IF010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i;
		String str="";
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오 ( 홀수면 남자/ 짝수면 여자 ) > ");
		i = sc.nextInt();
		
		if(i%2==0) {
			str="여자";
			
		}else {
			str="남자";
		}
		System.out.println(str);
		
	}

}
