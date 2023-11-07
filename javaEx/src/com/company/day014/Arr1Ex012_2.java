package com.company.day014;

import java.time.LocalDateTime;

public class Arr1Ex012_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 0, month = 0, day = 0;

		// 현재 날짜 기준 년,월,일
		LocalDateTime now = LocalDateTime.now();
		String str = now.toString();
		year = Integer.parseInt(str.substring(0, 4));
		month = Integer.parseInt(str.substring(5, 7));
		day = Integer.parseInt(str.substring(8, 10));

		System.out.println("* 서기 1년 ~ 오늘 까지 총 날수 : " + sum_days(year, month, day));
		System.out.println("* 내 생일 : 1986년 02월 11일");
		System.out.println("* 살아온 날 수 : " + (sum_days(year, month, day) - sum_days(1986, 2, 12) + 1));
		System.out.println("* " + now);

		MyCalendar.showCalendar(2023, 9, 18);

	}

	public static int sum_days(int year, int month, int day) {
		int sum = 0;
		String str = "";
		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1; i <= year - 1; i++) {
			str = (i % 4 == 0) ? ((i % 100 == 0) && !(i % 400 == 0)) ? "평년" : "윤년" : "평년";

			if (str == "윤년") {
				sum = sum + 366;
			} else if (str == "평년") {
				sum = sum + 365;
			}

		}

		for (int j = 1; j <= month; j++) {
			sum = sum + mon[j - 1];
		}
		sum += (year % 4 == 0) ? ((year % 100 == 0) && !(year % 400 == 0)) ? 0 : 1 : 0;

		sum += day;

		return sum;
	}

	public static String week(int year, int month, int day) {
		String[] day_of_week = { "일", "월", "화", "수", "목", "금", "토" };
		int sum = 0;
		String str = "";
		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1; i <= year - 1; i++) {
			str = (i % 4 == 0) ? ((i % 100 == 0) && !(i % 400 == 0)) ? "평년" : "윤년" : "평년";

			if (str == "윤년") {
				sum = sum + 366;
			} else if (str == "평년") {
				sum = sum + 365;
			}

		}

		for (int j = 1; j <= month; j++) {
			sum = sum + mon[j - 1];
		}
		sum += (year % 4 == 0) ? ((year % 100 == 0) && !(year % 400 == 0)) ? 0 : 1 : 0;

		sum += day;

		return day_of_week[sum % 7];

	}
	
	
	public static void showCalendar(int year, int month, int day) {

		String result = "";
		String str = "";
		int sum = 0;
		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };

		str = (year % 4 == 0) ? ((year % 100 == 0) && !(year % 400 == 0)) ? "평년" : "윤년" : "평년";
		for (int i = 1; i <= year - 1; i++) {

			if (str == "윤년") {
				sum = sum + 366;
			} else if (str == "평년") {
				sum = sum + 365;
			}

		}

		for (int j = 1; j <= month; j++) {
			sum = sum + mon[j - 1];
		}
		sum += (year % 4 == 0) ? ((year % 100 == 0) && !(year % 400 == 0)) ? 0 : 1 : 0;

		sum++;

		
		System.out.println("========== " + month + "월 ===================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");

		for (int i = 0; i < sum % 7; i++) {
			System.out.print("*\t");
		}

		for (int i = 1; i <= mon[month]; i++) {

			System.out.print(i + "\t");

			if ((sum % 7 + i) % 7 == 0) {
				System.out.println();
			}

		}

		if (str == "윤년" && month == 2) {
			System.out.print("29");

		}

	}

	
	
	
	
	
	
	
	
	
}
