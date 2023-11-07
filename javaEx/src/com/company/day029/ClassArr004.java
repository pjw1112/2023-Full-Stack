package com.company.day029;

import com.company.day029.etc.Score;
import com.company.day029.etc.ScorePrint;
import com.company.day029.etc.ScoreProcess;

public class ClassArr004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Score[] std = new Score[3];
		ScoreProcess sp = new ScoreProcess();
		ScorePrint print = new ScorePrint();

		std[0] = new Score("아이언맨", 100, 100, 100);
		std[1] = new Score("헐크", 90, 60, 80);
		std[2] = new Score("브랙팬서", 20, 60, 90);

		

		for (Score item : std) {
			sp.proceed(item);
		}

		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::");
		for (Score item : std) {
			print.print(item);
		}
	}

}
