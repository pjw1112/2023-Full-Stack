package com.company.day009;

import java.util.Scanner;

public class Switch004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		int num,num2;
		String season="";
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("숫자 1개 입력받기> ");
		num = sc.nextInt();
		num2 = num/3;  
		// 1~12까지 숫자중 제시받은 숫자를 3으로 나누어서 몫을 구함.
		// 몫이 1:봄 2:여름 3:가을 그외:겨울 로 처리
		
		//처리
		switch(num2) { case 1 : season="봄"; break;
					  case 2 : season="여름"; break;
					  case 3 : season="가을"; break;
					  default : season="겨울"; break;
					}
		
		//출력
		System.out.println(season+" 이다.");
		
		sc.close();
	}

}
