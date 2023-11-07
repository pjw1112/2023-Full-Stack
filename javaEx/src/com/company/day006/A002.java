package com.company.day006;

import java.util.Scanner;

public class A002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("숫자 입력 > ");
		a=sc.nextInt();
		String[] str = {"짝수","홀수"};
		System.out.println("입력받은 숫자는 "+ str[a%2]+"다");
		
		System.out.println("숫자 입력 > ");
		a=sc.nextInt();	
		System.out.println("입력받은 숫자는 3의 배수다 >>"+((a%3)==0));
		
		
	}

}
