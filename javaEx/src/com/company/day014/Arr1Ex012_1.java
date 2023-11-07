package com.company.day014;

public class Arr1Ex012_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] day_of_week = { "일", "월", "화", "수", "목", "금", "토" };
		int year = 2023, month = 9, day = 13, sum = 18;
		String todayYoil = "";

		for (int i = 1; i < year; i++) {

			sum += 1 % 4 == 0 && 1 % 100 != 0 || year % 400 == 0 ? 366 : 365;
		}

		for (int i = 0; i < month; i++) {
			sum += mon[i];
		}

		sum += 1 % 4 == 0 && 1 % 100 != 0 || year % 400 == 0 ? 1 : 0;
		sum += day;

		System.out.println("* 서기 1년 ~ 오늘 총날수 : " + sum);

		todayYoil = day_of_week[sum % 7];
		System.out.println(todayYoil + "요일");

		
		
		
		
		
	}

}
