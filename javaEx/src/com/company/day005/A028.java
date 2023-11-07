package com.company.day005;

import java.util.Scanner;

public class A028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="";
		int kor=0, eng=0, math=0, total=0;
		float avg = 0.0f;
		String level="";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수입력 : ");
		kor = sc.nextInt();
		System.out.println("영어점수입력 : ");
		eng = sc.nextInt();
		System.out.println("수학점수입력 : ");
		math = sc.nextInt();
		
		total=kor+eng+math;
		avg=total/3.0f;
		
		
		
		level= "Lv"+(int)avg/10;
		System.out.println("평균 : "+ avg);
		System.out.println("레벨 : "+ level);
		
		
		
				
	}

}
