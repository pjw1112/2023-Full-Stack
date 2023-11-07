package class_bank;

public class BankDto {
	private String id, pass;
	private int balance;
	static String Company = "(주)회사";

	public BankDto() {
		super();
		this.id = "";
		this.pass = "";
		this.balance = 0;
	}

	public BankDto(String id, String pass, int balance) {
		super();
		this.id = id;
		this.pass = pass;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public static String getCompany() {
		return Company;
	}

	public static void setCompany(String company) {
		Company = company;
	}

	@Override
	public String toString() {
		return "BankDto [id=" + id + ", pass=" + pass + ", balance=" + balance + "]";
	}

}
