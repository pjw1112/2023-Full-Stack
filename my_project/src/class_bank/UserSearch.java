package class_bank;

public class UserSearch extends Process {

	public void exec(BankDto[] users) {
		SubFunction subf = new SubFunction();
		System.out.println("잔액을 조회합니다. 아이디와 비밀번호를 입력해주세요.");
		System.out.println("아이디 입력 : ");
		scan_id = scan.next();
		System.out.println("비밀번호 입력 : ");
		scan_pass = scan.next();

		if (subf.sameIdCheck(users, scan_id)) {
			int i = subf.sameIdIndexNum(users, scan_id);
			if (users[i].getPass().equals(scan_pass)) {
				System.out.println();
				System.out.println("입력하신 계좌의 현재 잔액은 " + users[i].getBalance() + "입니다.");
				System.out.println();
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
