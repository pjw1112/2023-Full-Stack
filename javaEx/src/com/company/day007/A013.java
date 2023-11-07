package com.company.day007;

import java.util.Scanner;

import javax.imageio.stream.ImageOutputStreamImpl;

public class A013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int class_Num, kor, eng, math, total, level;
		float avg;
		String avg1, winloss, suwoomi, money;
		
		
		System.out.println("학번 > ");
		class_Num=sc.nextInt();
		System.out.println("국어 > ");
		kor=sc.nextInt();
		System.out.println("영어 > ");
		eng=sc.nextInt();
		System.out.println("수학 > ");
		math=sc.nextInt();
		
		total = kor+eng+math;
		avg=(float)total/3;
		avg1= String.format("%.1f", avg );
		winloss = avg>=60 ? "합격" : "불합격";
		level = (int)avg/10;
//		suwoomi = level >= 60 ? "양" : "가";
//		suwoomi = level >= 70 ? "미" : suwoomi;
//		suwoomi = level >= 80 ? "우" : suwoomi;
//		suwoomi = level >= 90 ? "수" : suwoomi;
		suwoomi = (level >= 90) ? "수" : (level >= 80) ? "우" : (level >= 70) ? "미" : (level >= 60) ? "양" : "가";
		money = avg>=95 ? "장학생" : "";
		
		
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(":: GREEN IT SCORE                               ");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생");
		System.out.println(class_Num+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg1+"\t"+winloss+"\t"+suwoomi+"("+level+")"+"\t"+money);
		
		
	}

}
