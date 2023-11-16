package calendar;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Calendar_JW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year = 0, month = 0, day = 0;

		// 현재 날짜 기준 년,월,일
		LocalDateTime now = LocalDateTime.now();
		String str = now.toString();
		year = Integer.parseInt(str.substring(0, 4));
		month = Integer.parseInt(str.substring(5, 7));
		day = Integer.parseInt(str.substring(8, 10));

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");

		// 형식을 적용하여 출력합니다.
		String formattedDate = now.format(formatter);

		System.out.println();
		System.out.println("서기 1년 ~ 오늘 까지 총 날수 : " + sum_days(year, month, day));
		System.out.println(formattedDate + " " + week(year, month, day) + "요일");

		System.out.println();
		showCalendar(year, 2, day);

	}

	// # 1 윤년인지 판단해서 문자로 반환
	static String leap(int year) {
		String str = (year % 4 == 0) ? ((year % 100 == 0) && !(year % 400 == 0)) ? "평년" : "윤년" : "평년";
		return str;
	}

	// # 1 윤년인지 판단해서 정수로 반환
	static int leapint(int year) {
		int str = (year % 4 == 0) ? ((year % 100 == 0) && !(year % 400 == 0)) ? 0 : 1 : 0;
		return str;
	}

	// # 2 요일 구하는 메서드
	public static String week(int year, int month, int day) {
		String[] day_of_week = { "일", "월", "화", "수", "목", "금", "토" };
		int sum = 0;
		String str = leap(year);
		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		for (int i = 1; i <= year - 1; i++) {
			
			if (str == "윤년") {
				sum = sum + 366;
			} else if (str == "평년") {
				sum = sum + 365;
			}

		}

		for (int i = 1; i <= month; i++) {
			sum = sum + mon[i - 1];
		}
		sum += leapint(year);

		sum += day;

		return day_of_week[sum % 7];

	}

	public static int sum_days(int year, int month, int day) {
		int sum = 0;
		String str = "";
		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		for (int i = 1; i <= year - 1; i++) {
			str = leap(year);

			if (str == "윤년") {
				sum = sum + 366;
			} else if (str == "평년") {
				sum = sum + 365;
			}

		}

		for (int j = 1; j <= month; j++) {
			sum = sum + mon[j - 1];
		}
		sum += leapint(year);

		sum += day;

		return sum;
	}

	// # 3 달력을 출력하는 메서드
	public static void showCalendar(int year, int month, int day) {

		String result = "";
		String str = leap(year);
		int sum = 0;
		int[] mon = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
 
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
		sum += leapint(year);

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
