package com.company.day023;

import java.util.Scanner;

public class Class009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score001 sc001 = new Score001();

		sc001.input();

		sc001.calc();

		sc001.print();

	}

}

class Score001 {
	Scanner scanner = new Scanner(System.in);
	String name = "";
	int kor, eng, math, total;
	float avg = 0.0f;
	String pass = "";
	String jang = "";
	String star = "";

	int inputNum() {
		return scanner.nextInt();
	}

	String inputName() {
		return scanner.next();
	}

	void input() {

		System.out.println("이름입력 > ");
		name = inputName();
		System.out.println("국어입력 > ");
		kor = inputNum();
		System.out.println("영어입력 > ");
		eng = inputNum();
		System.out.println("수학입력 > ");
		math = inputNum();

	}

	void calc() {
		total = kor + eng + math;
		avg = Float.parseFloat(String.format("%.2f", total / 3.0));
		if (avg >= 60 && kor >= 40 && eng >= 40 && math >= 40) {
			pass = "합격";
		} else {
			pass = "불합격";
		}

		if (avg > 95) {
			jang = "장학생";
		} else {
			jang = " ";
		}
		for (int i = 0; i < avg / 10; i++) {
			star += "★";
		}
	}

	void print() {

		System.out.println("---------------------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("---------------------------------------------------------------------");
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + total + "\t" + avg + "\t" + pass + "\t"
				+ jang + "\t" + star);

	}

}