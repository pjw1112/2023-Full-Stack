package class_bank;

public class Withdraw extends Process {

	public void exec(BankDto[] users) {
		SubFunction subf = new SubFunction();
		System.out.println("지정된 계좌에서 출금합니다.");
		System.out.println("아이디와 비밀번호를 입력해주세요.");
		System.out.println("아이디 입력 : ");
		scan_id = scan.next();
		System.out.println("비밀번호 입력 : ");
		scan_pass = scan.next();

		if (subf.sameIdCheck(users, scan_id)) {
			int i = subf.sameIdIndexNum(users, scan_id);
			if (users[i].getPass().equals(scan_pass)) {
				System.out.println();
				System.out.println("출금할 금액을 입력해주세요 >>");
				int money = subf.intNum(scan);
				if (money == -1) {
					System.out.println("입력횟수 초과!!! 다시 시도해주세요.");

				}
				if (money > 0) {
					if (users[i].getBalance() - money >= 0) {
						users[i].setBalance(users[i].getBalance() - money);

						System.out.println("출금이 완료되었습니다.");
						System.out.println("잔액 : " + users[i].getBalance());
						System.out.println();
					} else {
						System.out.println("잔액보다 많은 금액을 출금 할 수 없습니다. 다시 시도해주세요.");
						System.out.println();
					}
				} else {
					System.out.println("0원 이하의 금액을 출금 할 수 없습니다. 다시 시도해주세요.");
					System.out.println();
				}

			} else {
				System.out.println();
				System.out.println("입력하신 계좌의 비밀번호가 일치하지 않습니다. 다시 시도해주세요.");
				System.out.println();
			}

		} else {
			System.out.println();
			System.out.println("입력한 계정 정보가 존재하지 않습니다. 새로 계정을 추가해주세요.");
			System.out.println();
		}
	}
}
