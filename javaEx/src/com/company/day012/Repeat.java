package com.company.day012;

import java.util.Scanner;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수
		Scanner sc = new Scanner(System.in);
		int kor, eng, math, tot, level=0;
		float avg=0.0f;
		String stdid, avg1, acceptance, aA, scholorship = "", level_s = "", kor_A, eng_A, math_A;

		// 입력
		System.out.println("이름을 입력하시오. > ");
		stdid = sc.next();

		for (;;) {
			System.out.println("국어 > ");
			kor = sc.nextInt();
			if (0 <= kor && kor <= 100) {
				break;
			}
		}
		for (;;) {
			System.out.println("영어 > ");
			eng = sc.nextInt();
			if (0 <= eng && eng <= 100) {
				break;
			}
		}
		for (;;) {
			System.out.println("수학 > ");
			math = sc.nextInt();
			if (0 <= math && math <= 100) {
				break;
			}
		}

		// 처리
		tot = kor + eng + math;
		avg = (float)tot/3;
		avg1 = String.format("%.2f", (float)tot/3);  
		
		acceptance = avg >= 70 ? "합격" : "불합격";
		

		aA = (level >= 9) ? "수" : (level >= 8) ? "우" : (level >= 7) ? "미" : (level >= 6) ? "양" : "가";
		scholorship = avg >= 95 ? "장학생" : "";
		kor_A = (kor >= 90) ? "(수)" : (kor >= 80) ? "(우)" : (kor >= 70) ? "(미)" : (kor >= 60) ? "(양)" : "(가)";
		eng_A = (eng >= 90) ? "(수)" : (eng >= 80) ? "(우)" : (eng >= 70) ? "(미)" : (eng >= 60) ? "(양)" : "(가)";
		math_A = (math >= 90) ? "(수)" : (math >= 80) ? "(우)" : (math >= 70) ? "(미)" : (math >= 60) ? "(양)" : "(가)";

		if (avg >= 95) {
			scholorship = "장학생";
		}

		for (int i = level; i > 0; i--) {

			level_s = level_s + "★";
		}

		// 출력
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(stdid + "\t" + kor + kor_A + "\t" + eng + eng_A + "\t" + math + math_A + "\t" + tot + "\t"
				+ avg1 + "\t" + acceptance + "\t" + scholorship + "\t" + level_s);

		sc.close();
	}

}
