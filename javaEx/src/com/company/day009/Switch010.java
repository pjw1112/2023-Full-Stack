package com.company.day009;

import java.util.Scanner;

public class Switch010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		Scanner sc = new Scanner(System.in);
		int x, y; 
		double z=0.0;
		String result ="";
		char ch;
		
		//입력
		System.out.println("1. 정수를 하나 입력해주세요. > ");
		x = sc.nextInt();
		
		System.out.println("2. 정수를 하나 입력해주세요. > ");
		y = sc.nextInt(); 
		
		System.out.println("3. 연산자를 입력해주세요. ( +, -, *, / ) > ");
		ch = sc.next().charAt(0);
		
		//처리
		switch(ch) {
		case '+' : z = x + y;			 result = Double.toString( z); break;
		
		case '-' : z = x - y; 			 result = Double.toString( z); break;
		
		case '/' : z = (double)x / y;	 result = String.format("%.2f", z);  break;
		
		case '*' : z = x * y;  			 result = Double.toString( z); break;
					}
		
		
		//출력
		System.out.println(""+x+ch+y+"="+result);
		sc.close();
		
				
	}

}
