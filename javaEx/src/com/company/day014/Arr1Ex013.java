package com.company.day014;

public class Arr1Ex013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		String[] name = { "아이언맨", "헐크", "캡틴", "토르", "호크아이" };
		int[] kor = { 100, 20, 90, 70, 35 };
		int[] eng = { 100, 50, 95, 80, 100 };
		int[] mat = { 100, 30, 90, 60, 100 };
		int[] aver = new int[5];
		String[][] hap_jang = new String[5][2]; //합격 여부와 장학생여부 담을 2차원 String 배열

		
		//평균 처리
		for (int i = 0; i < aver.length; i++) {
			aver[i] = (kor[i] + eng[i] + mat[i]) / 3;
		}
		
		//합격,장학생 여부 처리
		for (int i = 0; i < hap_jang.length; i++) {

			if (aver[i] >= 70 && kor[i] >= 40 && eng[i] >= 40 && mat[i] >= 40) {
				hap_jang[i][0] = "합격";
			} else {
				hap_jang[i][0] = "불합격";
			}

			if (aver[i] >= 95) {
				hap_jang[i][1] = "장학생";
			} else {
				hap_jang[i][1] = "---";
			}

		}
		
		//출력
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		for (int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(kor[i] + "\t");
			System.out.print(eng[i] + "\t");
			System.out.print(mat[i] + "\t");
			System.out.print(aver[i] + "\t");
			System.out.print(hap_jang[i][0] + "\t");
			System.out.print(hap_jang[i][1] + "\t");
			System.out.println();
		}

	}

}
