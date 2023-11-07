package com.company.day008;

import java.util.Scanner;

public class IF011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1~5세 사이의 어린이의 나이를 구해주세요
		int age;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("어린이의 나이를 입력해주세요 : ");
		age = sc.nextInt();
		
		if(1<=age && age <=5) {
			System.out.println("어린이의 나이는 "+age+" 세 입니다.");
		}else {
			System.err.println("어린이의 나이는 1~5세 사이가 아닙니다.");
		}
	}

}
