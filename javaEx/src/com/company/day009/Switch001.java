package com.company.day009;

import java.util.Scanner;

public class Switch001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		int a=0; String result="";
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("숫자한개 입력 > ");
		a = sc.nextInt();
		
		//처리
//if- version
//			if( a == 1 ) { result = "1이다"; }
//	   else if( a == 2 ) { result = "2이다"; }
//	   else if( a == 3 ) { result = "3이다"; }
//	   else 			 { result = "1,2,3이 아니다"; }

	   
		
	   switch( a ) { case 1 : result = "1이다";  break; 
	   				 case 2 : result = "2이다";  break;
	   				 case 3 : result = "3이다";  break;
	   			    default : result = "1,2,3이 아니다.";
	   				}
	   //출력
	   System.out.println( result );
	   sc.close();
	}

}
// 1. 숫자 한개 입력받기
// 2. if 다형식을 이용해서 1,2,3 이다. 출력