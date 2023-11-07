package mini_bank;

import java.util.Scanner;

public class SubFunction {

	Scanner scan;

	// 메인메서드가 포함된 클래스의 Scanner 객체 받아서 사용
	public SubFunction(Scanner scan) {
		this.scan = scan;
	}

	// int 타입 입력이 필요한 경우 > scanner객체로 int타입 이외의 입력이 들어왔을때 예외처리 및 재 입력
	int intNum(Scanner scan) {

		int num = -1;
		for (int i = 3; i >= 0; i--) {
			try {
				num = Integer.parseInt(scan.next());
				break;
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("정수를 입력해주세요. 남은 입력 횟수 : " + i);
				System.out.println("입력 >>>");
			}

		}
		return num;
	}

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

	boolean IdCount(String[][] str1) {
		boolean bool = true;
		int count = 0;
		for (int i = 0; i < str1.length; i++) {
			if (str1[i][0] != null || !str1[i][0].isEmpty() || !str1[i][0].equals("")) {

				count++;
			}
		}
		
		if(count<3) {
			bool = false;
		}
		
		return bool;
	}

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

	// 다시 입력할지 초기화면으로 돌아갈지 선택 받는 메서드
	int reEnterCheck(int reEnterNum) {

		for (;;) {

			System.out.println("1. 다시 입력  2.초기화면으로");
			System.out.println("선택 >>");
			try {
				reEnterNum = Integer.parseInt(scan.next());
			} catch (Exception e) {

				System.out.println("숫자를 입력해주세요");
			}
			if (reEnterNum == 1 || reEnterNum == 2) {
				break;

			} else {
				System.out.println();
				System.out.println("1 혹은 2 둘 중 하나를 선택해주세요.");
				System.out.println();
			}

		}

		return reEnterNum;

	}// 다시 입력할지 초기화면으로 돌아갈지 선택 받는 메서드 END

	// 아이디 유효성 체크
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

	}// 아이디 유효성 체크 END

	// 패스워드 유효성 체크
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
	}// 패스워드 유효성 체크 END

	// 잔고 유효성 체크
	boolean balanceValidityCheck(String str1) {
		boolean bool = false;
		int balance = 0;

		try {
			balance = Integer.parseInt(str1);
			if (balance >= 0) {
				bool = true;

			}
		} catch (Exception e) {
			// TODO: handle exception

		}

		return bool;

	}// 잔고 유효성 체크 END

}// class END
