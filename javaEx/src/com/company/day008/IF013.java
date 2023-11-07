package com.company.day008;

import java.util.Scanner;

public class IF013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int x, y; 
		double z=0.0;
		String result ="";
		char ch;
		
		System.out.println("1. 정수를 하나 입력해주세요. > ");
		x = sc.nextInt();
		
		System.out.println("2. 정수를 하나 입력해주세요. > ");
		y = sc.nextInt(); 
		
		System.out.println("3. 연산자를 입력해주세요. ( +, -, *, / ) > ");
		ch = sc.next().charAt(0);
		
		
		if(ch=='+') { z = x + y; result = Integer.toString((int) z);}
		
		else if(ch=='-') { z = x - y; result = Integer.toString((int) z); }
		
		else if(ch=='/') { z = (double)x / y; result=String.format("%.2f", z);   }
		
		else if(ch=='*') { z = x * y;  result = Integer.toString((int) z);  }
		
		System.out.println(""+x+ch+y+"="+result);
		
		sc.close();
		
	}

}
