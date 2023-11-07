package com.company.day009;

import java.util.Scanner;

public class Switch002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		int num;
		String season="";
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("숫자 1개 입력받기> ");
		num = sc.nextInt();
		
		//처리
		switch(num) { case 3 : season="봄"; break;
					  case 6 : season="여름"; break;
					  case 9 : season="가을"; break;
					  case 12 : season="겨울"; break;
					}
		
		//출력
		System.out.println(season+" 이다.");
		sc.close();
	}

}
