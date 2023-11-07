package com.company.day014;

public class MyCalendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		showCalendar(2024, 12, 18);
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
