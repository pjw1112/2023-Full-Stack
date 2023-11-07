package class_bank;

import java.util.Scanner;

public class Process {

	Process[] process=new Process[10];
	SubFunction subf = new SubFunction();		
	// 사용자에게 입력 받을 값
	String scan_balance = "";
	String scan_id = "";
	String scan_pass = "";

	// 부가기능들 모아놓은 클래스 입니다 (ex 비어있는 BankDto[] index넘버 검색, id 유효성 검사 등등 )
	
	Scanner scan = new Scanner(System.in);

	// 생성자 정의
	public Process() {

	}

	public Process(BankDto[] dto) {
		this();
		for (int i = 0; i < dto.length; i++) {
			dto[i] = new BankDto();
		}
		process[1] = new UserAdd();
		process[2] = new UserSearch();
		process[3] = new Deposit();
		process[4] = new Withdraw();
		process[5] = new UserDelete();
		
		this.menu(dto);
		
	}
	// 메서드
	void exec(BankDto[] users) {}
	
	
	void menu(BankDto[] users) {
		int num = 0;

		do {

			System.out.println("WELCOME!");
			System.out.println("=====BANK=====");
			System.out.println("* 1. 추가");
			System.out.println("* 2. 조회");
			System.out.println("* 3. 입금");
			System.out.println("* 4. 출금");
			System.out.println("* 5. 삭제");
			System.out.println("* 9. 종료");
			System.out.println("");
			System.out.println("입력 >>>");

			num = subf.intNum(scan);

			switch (num) {

			case 1:
				process[num].exec(users);
				break; // 가입

			case 2:
				process[num].exec(users);
				break; // 조회

			case 3:
				process[num].exec(users);
				break; // 입금

			case 4:
				process[num].exec(users);
				break; // 출금

			case 5:
				process[num].exec(users);
				break; // 삭제

			case 9:
				System.out.println();
				System.out.println("프로그램을 종료합니다. 안녕히 가세요.");
				System.out.println();
				break; // 나가기

			case 777: // users 확인용
				for (int i = 0; i < users.length; i++) {
					System.out
							.print(users[i].getId() + "\t" + users[i].getPass() + "\t" + users[i].getBalance() + "\t");
					System.out.println();
				}

			default:

				System.out.println();
				System.out.println("메뉴에 주어진 1 ~ 9 숫자 중 하나를 입력해주세요");
				System.out.println();

			}// switch END

		} while (num != 9); // while END

	}

}
