package practice;

import java.util.Scanner;

class BankDto {
	
	private String id, pass;
	private double balance;
	static String Company = "(주)회사";

	public BankDto(String id, String pass, double balance) {
		super();
		this.id = id;
		this.pass = pass;
		this.balance = balance;
	}

	public BankDto() {
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "ID: " + id + "\nBalance: " + balance;
	}
}
class Process {
    private Scanner scanner;
    private BankDto dto;
    private UserAdd add;
    private UserSearch search;
    private Deposit deposit;
    private Withdraw withdraw;
    private UserDelete delete;

    public Process() {
        scanner = new Scanner(System.in);
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

    public void menu() {
        int num = -1;
        while (num != 9) {
            System.out.println("..........유저상태확인 > " + dto);
            System.out.println("\n\n=====" + BankDto.Company + " BANK=====\r\n" + "1.추가\r\n" + "2.조회\r\n" + "3.입금\r\n"
                    + "4.출금\r\n" + "5.삭제\r\n" + "9.종료\r\n" + "입력>>>");
            num = scanner.nextInt();

            switch (num) {
                case 1:
                    add.exec(this.dto, scanner);
                    break;
                case 2:
                    search.exec(this.dto, scanner);
                    break;
                case 3:
                    deposit.exec(this.dto, scanner);
                    break;
                case 4:
                    withdraw.exec(this.dto, scanner);
                    break;
                case 5:
                    delete.exec(this.dto, scanner);
                    break;
                case 9:
                    System.out.println("종료기능입니다.");
                    break;
            }
        }
    }
}

class UserAdd {
    public void exec(BankDto dto, Scanner scanner) {
        System.out.print("아이디 입력: ");
        String temp_id = scanner.next();
        System.out.print("비밀번호 입력: ");
        String temp_pass = scanner.next();
        
        System.out.print("잔액 입력: ");
        double balance = scanner.nextDouble();
        if (dto.getId() == null) {
            dto.setId(temp_id);
            dto.setPass(temp_pass);
            dto.setBalance(balance);

            System.out.println("계정이 생성되었습니다.");
        } else {
            System.out.println("이미 생성된 계정이 있습니다.");
        }
    }
}

class UserSearch {
    public void exec(BankDto dto, Scanner scanner) {
        System.out.print("아이디 입력: ");
        String temp_id = scanner.next();
        System.out.print("비밀번호 입력: ");
        String temp_pass = scanner.next();

        if (dto.getId() != null && dto.getId().equals(temp_id) && dto.getPass().equals(temp_pass)) {
            System.out.println("ID: " + dto.getId());
            System.out.println("비밀번호: " + dto.getPass());
            System.out.println("잔액: " + dto.getBalance());
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
}

class Deposit {
    public void exec(BankDto dto, Scanner scanner) {
        System.out.print("아이디 입력: ");
        String temp_id = scanner.next();
        System.out.print("비밀번호 입력: ");
        String temp_pass = scanner.next();

        if (dto.getId() != null && dto.getId().equals(temp_id) && dto.getPass().equals(temp_pass)) {
            System.out.print("입금할 금액을 입력하세요: ");
            double dw = scanner.nextDouble();

            dto.setBalance(dto.getBalance() + dw);
            System.out.println("입금 완료");
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
}

class Withdraw {
    public void exec(BankDto dto, Scanner scanner) {
        System.out.print("아이디 입력: ");
        String temp_id = scanner.next();
        System.out.print("비밀번호 입력: ");
        String temp_pass = scanner.next();

        if (dto.getId() != null && dto.getId().equals(temp_id) && dto.getPass().equals(temp_pass)) {
            System.out.print("출금할 금액을 입력하세요: ");
            double dw = scanner.nextDouble();

            if (dto.getBalance() >= dw) {
                dto.setBalance(dto.getBalance() - dw);
                System.out.println("출금 완료");
            } else {
                System.out.println("잔액 부족");
            }
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
}

class UserDelete {
    public void exec(BankDto dto, Scanner scanner) {
        System.out.print("아이디 입력: ");
        String temp_id = scanner.next();
        System.out.print("비밀번호 입력: ");
        String temp_pass = scanner.next();

        if (dto.getId() != null && dto.getId().equals(temp_id) && dto.getPass().equals(temp_pass)) {
            System.out.print("계좌를 삭제하시겠습니까? (Y/N): ");
            String delete = scanner.next();

            if (delete.equalsIgnoreCase("Y") || delete.equalsIgnoreCase("y")) {
                dto.setId(null);
                dto.setPass(null);
                dto.setBalance(0);
                System.out.println("계좌가 삭제되었습니다.");
            }
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }
}

public class Bank_Composition {
    public static void main(String[] args) {
        BankDto user1 = new BankDto();
        Process process = new Process(user1);
    }
}