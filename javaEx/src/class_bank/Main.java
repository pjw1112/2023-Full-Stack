package class_bank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		BankDto[] users = new BankDto[3];
		for (int i = 0; i < users.length; i++) {
			users[i] = new BankDto();
		}
		Process process = new Process();

		do {

			num = process.menu();

			switch (num) {

			case 1:
				process.getAdd().exec(users);
				break; // 가입

			case 2:
				process.getSearch().exec(users);
				break; // 조회

			case 3:
				process.getDeposit().exec(users);
				break; // 입금

			case 4:
				process.getWithdraw().exec(users);
				break; // 출금

			case 5:
				process.getDelete().exec(users);
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

	}// END main
}// END main class
