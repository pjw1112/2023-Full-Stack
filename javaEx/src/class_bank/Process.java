package class_bank;

import java.util.Scanner;

public class Process {
	private BankDto dto;
	// Process 기능 클래스는 다음 클래스를 멤버변수로 사용한다.
	private UserAdd add; // 유저추가
	private UserSearch search; // 유저검색
	private Deposit deposit; // 입금
	private Withdraw withdraw; // 출금
	private UserDelete delete; // 유저삭제

	Scanner scan = new Scanner(System.in);
	SubFunction subf = new SubFunction();

	// 생성자 정의
	public Process() {
		add = new UserAdd();
		search = new UserSearch();
		deposit = new Deposit();
		withdraw = new Withdraw();
		delete = new UserDelete();
	}

	public Process(BankDto dto) {
		this();
		this.dto = dto;
		this.menu();
	}

	// getter, setter
	public BankDto getDto() {
		return dto;
	}

	public void setDto(BankDto dto) {
		this.dto = dto;
	}

	public UserAdd getAdd() {
		return add;
	}

	public void setAdd(UserAdd add) {
		this.add = add;
	}

	public UserSearch getSearch() {
		return search;
	}

	public void setSearch(UserSearch search) {
		this.search = search;
	}

	public Deposit getDeposit() {
		return deposit;
	}

	public void setDeposit(Deposit deposit) {
		this.deposit = deposit;
	}

	public Withdraw getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(Withdraw withdraw) {
		this.withdraw = withdraw;
	}

	public UserDelete getDelete() {
		return delete;
	}

	public void setDelete(UserDelete delete) {
		this.delete = delete;
	}

	public Scanner getScan() {
		return scan;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	// 메서드
	int menu() {
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

		return subf.intNum(scan);

	}


}
