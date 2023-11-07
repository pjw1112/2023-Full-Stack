package com.company.day010;

import java.util.Scanner;

public class For009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 변수
		int year;
		int j = 0;
		String str;
		Scanner sc = new Scanner(System.in);

		// 입력
		System.out.println("윤년의 갯수 구하기 ~~까지 (~~숫자 입력) > ");
		year = sc.nextInt();

		// 처리
		for (int i = 1; i <= year; i++) {

			// 윤년 검사
			str = (i % 4 == 0) ? ((i % 100 == 0) && !(i % 400 == 0)) ? "평년" : "윤년" : "평년";

			// 윤년 카운트
			if (str == "윤년") {
				j = j + 1;
			}

		} // for END

		// 출력
		System.out.println("서기1년~ 서기" + year + "년 중에서 윤년의 개수 : " + j);

	}

}
