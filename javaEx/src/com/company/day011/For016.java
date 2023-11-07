package com.company.day011;

import java.util.Scanner;

public class For016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수
		Scanner sc = new Scanner(System.in);

		int kor, eng, math, tot, level;
		float avg;
		String stdid, avg1, winloss, suwoomi, money = "", level_s = "";
		String kor_suwoomi, eng_suwoomi, math_suwoomi;

		// 입력
		System.out.println("이름 > ");
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
		avg = (float) tot / 3;
		avg1 = String.format("%.2f", avg);
		winloss = avg >= 70 ? "합격" : "불합격";
		level = (int) avg / 10;

		suwoomi = (level >= 9) ? "수" : (level >= 8) ? "우" : (level >= 7) ? "미" : (level >= 6) ? "양" : "가";
		money = avg >= 95 ? "장학생" : "";

		kor_suwoomi = (kor >= 90) ? "(수)" : (kor >= 80) ? "(우)" : (kor >= 70) ? "(미)" : (kor >= 60) ? "(양)" : "(가)";
		eng_suwoomi = (eng >= 90) ? "(수)" : (eng >= 80) ? "(우)" : (eng >= 70) ? "(미)" : (eng >= 60) ? "(양)" : "(가)";
		math_suwoomi = (math >= 90) ? "(수)"
				: (math >= 80) ? "(우)" : (math >= 70) ? "(미)" : (math >= 60) ? "(양)" : "(가)";

		if (avg >= 95) {
			money = "장학생";
		}

		for (int i = level; i > 0; i--) {

			level_s = level_s + "★";
		}

		// 출력
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t레벨");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println(stdid + "\t" + kor + kor_suwoomi + "\t" + eng + eng_suwoomi + "\t" + math + math_suwoomi
				+ "\t" + tot + "\t" + avg1 + "\t" + winloss + "\t" + money + "\t" + level_s);

		sc.close();
	}

}
