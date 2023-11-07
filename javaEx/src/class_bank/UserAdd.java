package class_bank;

import java.util.Scanner;

public class UserAdd {
	String scan_balance = "";
	String scan_id = "";
	String scan_pass = "";

	SubFunction subf = new SubFunction();
	Scanner scan = new Scanner(System.in);
	
	boolean IdCount(BankDto[] users) {
		boolean bool = true;
		int count = 0;
		for (int i = 0; i < users.length; i++) {
			if (!users[i].getId().equals("")) {

				count++;
			}
		}

		if (count >= 3) {
			bool = false;
		}

		return bool;
	}

	public void exec(BankDto[] users) {
		if (IdCount(users)) {

			int sequence = 0;
			System.out.println("계정 생성 조건##");
			System.out.println("아이디  : 8자 이상 12자 이하, 영문 대소문자 + 숫자, 특수문자나 공백 불가");
			System.out.println("비밀번호 : 4자 이상 12자 이하, 영문 대소문자 + 숫자 + 특수문자(!@#$%^&*_ 1~4자 반드시 포함)");

			for (;;) {

				// 시퀀스 0 일 경우 아이디 체크
				if (sequence == 0) {

					System.out.println("아이디 입력 : ");
					scan_id = scan.next();

					if (subf.idValidityCheck(scan_id)) {

						if (!subf.sameIdCheck(users, scan_id)) {

							sequence = 1;
						} else {
							System.out.println("중복된 아이디가 존재합니다. 다른 아이디를 입력해주세요.");
							System.out.println();

						}

					} else {
						scan_id = null;

						int reEnterNum = 0;
						reEnterNum = subf.reEnterCheck(reEnterNum);

						if (reEnterNum == 1) {
							continue;
						} else if (reEnterNum == 2) {
							break;
						}
					}

				} // sequence 0 END - id 유효성 검사 및 입력 완료

				// 시퀀스 1 일 경우 비밀번호 체크
				if (sequence == 1) {

					System.out.println("비밀번호 입력 : ");
					scan_pass = scan.next();

					if (subf.passValidityCheck(scan_pass)) {

						sequence = 2;

					} else {
						scan_pass = null;

						int reEnterNum = 0;
						reEnterNum = subf.reEnterCheck(reEnterNum);

						if (reEnterNum == 1) {
							continue;
						} else if (reEnterNum == 2) {
							break;
						}
					}

				} // sequence=1 END - password 유효성 검사 및 입력 완료

				// 시퀀스 2일 경우 잔고 체크 : 마지막 과정
				if (sequence == 2) {

					System.out.println("잔액 입력 : ");
					scan_balance = scan.next();

					if (subf.balanceValidityCheck(scan_balance)) {
						int i = subf.nullCheck(users);
						users[i].setId(scan_id);
						users[i].setPass(scan_pass);;
						users[i].setBalance( Integer.parseInt(scan_balance));
						System.out.println("새로운 계정을 생성하는데 성공했습니다!");
						System.out.println();
						break;
					} else {
						scan_balance = null;
						System.out.println("잔고 값은 양의 정수로 입력되어야 합니다.");
						System.out.println();
						int reEnterNum = 0;
						reEnterNum = subf.reEnterCheck(reEnterNum);

						if (reEnterNum == 1) {
							continue;
						} else if (reEnterNum == 2) {
							break;
						}
					}

				} // sequence=2 END - 잔고 유효성 검사 및 입력 완료

			} // for END
		} else {
			System.out.println("3명이 넘어가면 더이상 신규가입이 불가합니다. ");
			System.out.println();
		
		}
	}
	
}
