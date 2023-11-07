package com.company.day008;

import java.util.Scanner;

public class IF014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int stdid, kor, eng, math, tot, level;
		float avg;
		String avg1, winloss, suwoomi, money="";
		String kor_suwoomi, eng_suwoomi, math_suwoomi;
		
		
		System.out.println("학번 > ");
		stdid=sc.nextInt();
		System.out.println("국어 > ");
		kor=sc.nextInt();
		System.out.println("영어 > ");
		eng=sc.nextInt();
		System.out.println("수학 > ");
		math=sc.nextInt();
		
		tot = kor+eng+math;
		avg=(float)tot/3;
		avg1= String.format("%.2f", avg );
		winloss = avg>=60 ? "합격" : "불합격";
		level = (int)avg/10;

//		if( level >= 90 ) { suwoomi="수"; }
//		else if(level >= 80) { suwoomi="우"; }
//		else if(level >= 70) { suwoomi="미"; }
//		else if(level >= 60) { suwoomi="양"; }
//		else { suwoomi="가"; }
		
		suwoomi = (level >= 9) ? "수" : (level >= 8) ? "우" : (level >= 7) ? "미" : (level >= 6) ? "양" : "가";
		money = avg>=95 ? "장학생" : "";
		
		kor_suwoomi = (kor >= 90) ? "(수)" : (kor >= 80) ? "(우)" : (kor >= 70) ? "(미)" : (kor >= 60) ? "(양)" : "(가)";
		eng_suwoomi = (eng >= 90) ? "(수)" : (eng >= 80) ? "(우)" : (eng >= 70) ? "(미)" : (eng >= 60) ? "(양)" : "(가)";
		math_suwoomi = (math >= 90) ? "(수)" : (math >= 80) ? "(우)" : (math >= 70) ? "(미)" : (math >= 60) ? "(양)" : "(가)";
		
		
		if( avg>=95 ) { money="장학생"; }
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("학번\t국어\t영어\t수학\t총점\t평균\t합격여부\t레벨\t장학생");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("std"+stdid+"\t"+kor+kor_suwoomi+"\t"+eng+eng_suwoomi+"\t"+math+math_suwoomi+"\t"+tot+"\t"+avg1+"\t"+winloss+"\t"+suwoomi+"("+level+")"+"\t"+money);
		
		sc.close();
	}

}
