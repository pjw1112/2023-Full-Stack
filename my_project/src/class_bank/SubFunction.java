package class_bank;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SubFunction{

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

	int nullCheck(BankDto[] users) {
		int row_num = 0;
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				row_num = i;
				break;
			} else {

				if (users[i].getId() == "") {
					row_num = i;
					break;
				}

			}

		}
		return row_num;
	}// nullCheck END

	boolean IdCount(BankDto[] users) {
		boolean bool = true;
		int count = 0;
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
			} else {

				if (users[i].getId() == "") {

				} else {
					count++;
				}

			}
		}

		if (count >= 3) {
			bool = false;
		}

		return bool;
	}

	// 2차원 문자열 배열 변수1과 문자열 변수2를 받아서 변수1의 0열에 변수2와 동일한 문자가 있는지 검사 모든 행 반복 후 동일한 문자가
	// 하나 이상 있으면 false 반환, 없으면 true반환
	boolean sameIdCheck(BankDto[] users, String str) {
		boolean bool = false;
		for (int i = 0; i < users.length; i++) {

			if (users[i] == null) {

				// 문자열이 null 또는 비어 있음
			} else {
				if (users[i].getId().equals(str)) {
					bool = true; // 같은 문자열이 있을때 boolean bool 값을 true로 반전
				}

				// 문자열에 값이 있음
			}

		}
		return bool;
	}// sameIdCheck END

	// 같은 문자열을 가진 문자열배열의 행 넘버를 int정수로 반환
	int sameIdIndexNum(BankDto[] users, String str) {
		int indexNum = 0;
		for (int i = 0; i < users.length; i++) {

			if (users[i] == null) {

				// 문자열이 null 또는 비어 있음
			} else {
				if (users[i].getId().equals(str)) {
					indexNum = i;
				}

				// 문자열에 값이 있음
			}

		}
		return indexNum;
	}// sameIdIndexNum END

	// 다시 입력할지 초기화면으로 돌아갈지 선택 받는 메서드
	int reEnterCheck(int reEnterNum, Scanner scan) {

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

		if (Pattern.matches("^[a-z0-9]{6,12}$", str1)) {

		} else {
			System.out.println();
			System.out.println("아이디 생성 규칙을 만족하지 못합니다. 다시 확인해주세요.");
			System.out.println("6자 이상~ 12자 이하, 영문 소문자와 숫자로만 구성");
			System.out.println();
			bool = false;

		}

		return bool;

	}// 아이디 유효성 체크 END

	// 패스워드 유효성 체크
	boolean passValidityCheck(String str1) {

		boolean bool = true;

		if (Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#+\\\\-_*]).{4,12}$", str1)) {

		} else {
			bool = false;

			System.out.println("비밀번호 생성 규칙을 만족하지 못합니다. 다시 확인해주세요.");
			System.out.println("소문자, 대문자, 특수문자(!@#+-_* ) 각각 1개 이상 포함. 4자 이상 12자 이하");
			System.out.println();

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
}
