package pjw;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubFunction {

	// 2차원 문자열 배열을 받아서 0열이 null값이 아닌 첫번째 행을 발견하면 종료하고 행번호 반환
	int nullCheck(String[][] str1) {
		int row_num = 0;
		for (int i = 0; i < str1.length; i++) {
			if (str1[i][0] == null || str1[i][0].isEmpty()) {
				row_num = i;
				break;
			}
		}
		return row_num;
	}// nullCheck END

	
	
	
	
	
	// 2차원 문자열 배열 변수1과 문자열 변수2를 받아서 변수1의 0열에 변수2와 동일한 문자가 있는지 검사 모든 행 반복 후 동일한 문자가
	// 하나 이상 있으면 false 반환, 없으면 true반환
	boolean sameIdCheck(String[][] str1, String str2) {
		boolean bool = false;
		for (int i = 0; i < str1.length; i++) {

			if (str1[i][0] == null || str1[i][0].isEmpty()) {

				// 문자열이 null 또는 비어 있음
			} else {
				if (str1[i][0].equals(str2)) {
					bool = true; // 같은 문자열이 있을때 boolean bool 값을 true로 반전
				}

				// 문자열에 값이 있음
			}

		}
		return bool;
	}// sameIdCheck END

	
	
	
	
	
	// 같은 문자열을 가진 문자열배열의 행 넘버를 int정수로 반환
	int sameIdIndexNum(String[][] str1, String str2) {
		int indexNum = 0;
		for (int i = 0; i < str1.length; i++) {

			if (str1[i][0] == null || str1[i][0].isEmpty()) {

				// 문자열이 null 또는 비어 있음
			} else {
				if (str1[i][0].equals(str2)) {
					indexNum = i;
				}

				// 문자열에 값이 있음
			}

		}
		return indexNum;
	}// sameIdIndexNum END

	
	
	
	
	
	
	void reEnterCheck() {
	
		Scanner scan1 = new Scanner(System.in);

	
	
	}
	
	
	
	
	
	
	
	
	boolean idValidityCheck(String str1) {

		boolean bool = true;
		String str = str1;

		if (8 <= str.length() && str.length() <= 12) {

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);

				if ('A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z' || '0' <= ch && ch <= '9') {

				} else {
					System.out.println();
					System.out.println("아이디는 영문 대소문자와 숫자로만 이루어져야 합니다.");
					System.out.println("(특수문자, 공백 불가) 다시 확인해주세요.");
					System.out.println();
					bool = false;
					break;

				}

			}

		} else {
			System.out.println();
			System.out.println("아이디는 8자 이상 12자 이하 여야 합니다. 다시 확인해주세요.");
			System.out.println();
			bool = false;
		}

		return bool;

	}// idValidityCheck END

	
	
	
	
	
	boolean passValidityCheck(String str1) {

		boolean bool = true;
		int Special_characters = 0;
		String str = str1;

		if (4 <= str.length() && str.length() <= 12) {

			for (int i = 0; i < str.length(); i++) {

				char ch = str.charAt(i);

				if ('A' <= ch && ch <= 'Z' || 'a' <= ch && ch <= 'z' || '0' <= ch && ch <= '9' || ch == '!' || ch == '@'
						|| ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*' || ch == '_') {

				} else {
					System.out.println();
					System.out.println("비밀번호는 영문 대소문자와 숫자, !@#$%^&*_ 제외 특수문자 로만 이루어져야 합니다.");
					System.out.println("다시 확인해주세요.");
					System.out.println();
					bool = false;
					break;

				}

				if (ch == '!' || ch == '@' || ch == '#' || ch == '$' || ch == '%' || ch == '^' || ch == '&' || ch == '*'
						|| ch == '_') {
					Special_characters++;
				}

			}

			if (1 <= Special_characters && Special_characters <= 4) {

			} else {

				System.out.println();
				System.out.println("비밀번호에는 !@#$%^&*_ 포함 특수문자가 최소 1개 이상 최대 4개 이하 포함되어야 합니다  ");
				System.out.println("다시 확인해주세요.");
				System.out.println();
				bool = false;

			}

		} else {
			System.out.println();
			System.out.println("비밀번호는 4자 이상 12자 이하 여야 합니다. 다시 확인해주세요.");
			System.out.println();
			bool = false;
		}

		return bool;

	}// idValidityCheck END

}// class END





