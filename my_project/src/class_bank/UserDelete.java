package class_bank;

public class UserDelete extends Process {

	public void exec(BankDto[] users) {
		SubFunction subf = new SubFunction();
		System.out.println("계좌 정보를 삭제합니다.");
		System.out.println("아이디와 비밀번호를 입력해주세요.");
		System.out.println("아이디 입력 : ");
		scan_id = scan.next();
		System.out.println("비밀번호 입력 : ");
		scan_pass = scan.next();

		if (subf.sameIdCheck(users, scan_id)) {
			int i = subf.sameIdIndexNum(users, scan_id);
			if (users[i].getPass().equals(scan_pass)) {

				if (users[i].getBalance() > 0) {

					System.out.println("계좌에 잔액이 남아있습니다. ");
					System.out.println("잔액을 모두 출금 후 다시 시도해 주세요");
					System.out.println();

				} else {

					System.out.println("삭제하시겠습니까? (Y/N) ");
					String yesOrNo = scan.next();
					if (yesOrNo.equals("Y") || yesOrNo.equals("y")) {
						users[i].setId("");
						users[i].setPass("");
						users[i].setBalance(0);

						System.out.println();
						System.out.println("해당 계정이 삭제 되었습니다.");
						System.out.println();

					} else if (yesOrNo.equals("N") || yesOrNo.equals("n")) {
						System.out.println("삭제 취소");
					} else {
						System.out.println("입력이 바르지 않습니다. 다시 시도해주세요.");
						System.out.println();
					}

				}

			} else {
				System.out.println();
				System.out.println("입력하신 계좌의 비밀번호가 일치하지 않습니다. 다시 시도해주세요.");
				System.out.println();
			}

		} else {
			System.out.println();
			System.out.println("입력한 계정 정보가 존재하지 않습니다. 다시 확인해주세요.");
			System.out.println();
		}
	}
}
