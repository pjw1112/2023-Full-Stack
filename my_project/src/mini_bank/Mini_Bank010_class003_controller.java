package mini_bank;

class BankDto{
	//멤버변수
	private String id, pass;
	private double balance;
	static String Company="(주)회사";
}
class Process{
	private BankDto dto;
	// Process 기능 클래스는 다음 클래스를 멤버변수로 사용한다.
	private UserAdd add;	//유저추가
	private UserSearch search;	//유저검색
	private Deposit deposit;	//입금
	private Withdraw withdraw;	//출금
	private UserDelete delete;	//유저삭제
	
	
	public Process(){
		add = new UserAdd();
		search = new UserSearch();
		deposit = new Deposit();
		withdraw = new Withdraw();
		delete = new UserDelete();
	}
	public Process(BankDto dto){
		this();
		this.dto=dto;
		this.menu();
	}
	
	public void menu() {
		
	}
	
	
	
}




class UserAdd{
	public void exec(BankDto dto) {}
}

class UserSearch{
	public void exec(BankDto dto) {}
}

class Deposit{
	public void exec(BankDto dto) {}
}

class Withdraw{
	public void exec(BankDto dto) {}
}

class UserDelete{
	public void exec(BankDto dto) {}
}






///////////////////////
public class Mini_Bank010_class003_controller {
	public static void main(String[] args) {
		// Model  - 1명짜기
		BankDto  user1 = new BankDto();
		
		// Process
		Process process1 = new Process( user1 ); 

		
	}
}
