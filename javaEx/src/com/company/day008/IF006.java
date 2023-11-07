package com.company.day008;

import java.util.Scanner;

public class IF006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b,c,max=0, mid=0, min=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력(1) > ");
		a = sc.nextInt();
		System.out.println("숫자 입력(2) > ");
		b = sc.nextInt();
		System.out.println("숫자 입력(3) > ");
		c = sc.nextInt();
		
		
		if (a>b) {
			
					if(b>c){ max=a; mid=b; min=c;}else if(c>a) { max=c; mid=a; min=b; }
				
	}else if(b>a){
					 
					if(a>c){ max=b; mid=a; min=c;}else if(c>b) { max=c; mid=b; min=a; }
					 
	}else if(a>c) {
		
					if(c>b){ max=a; mid=c; min=b;}else if(c>b) { max=c; mid=b; min=a; }
	}
		
		System.out.println("최대값은 : " + max);
		System.out.println("중간값은 : " + mid);
		System.out.println("최소값은 : " + min);
		
		
	}

}
