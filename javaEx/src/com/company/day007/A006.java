package com.company.day007;

public class A006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		// 1. 2의 배수이면서 5의 배수라면 true / 아니면 false
					System.out.println(a%2==0 && a%5==0);
		
		// 2. 2의 배수 이거나 3의 배수
					System.out.println(a%2==0 || a%3==0);
					
		// 3. 3의 배수가 아니라면
					System.out.println(!(a%3==0));
					System.out.println(a%3!=0);
					
					
					
					
					
	}

}
