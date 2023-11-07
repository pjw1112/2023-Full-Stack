package mini_bank;


import java.util.Scanner;

public class bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		int select_Num = 0;
		String scan_balance = "";
		String scan_id = "";
		String scan_pass = "";
		boolean bool = true;
		String [][]users = {
				{"" , "" , ""},  //00 01 02    user1의 id, pass, balance
				{"" , "" , ""},  //10 11 12    user2의 id, pass, balance
				{"" , "" , ""}   //20 21 22    user3의 id, pass, balance 
		};
		
		SubFunction subf = new SubFunction(scan);

		while (bool) {

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

			select_Num = subf.intNum(scan);

			switch (select_Num) {

			case 1:
				
				if(subf.IdCount(users)) {
				
				int sequence = 0;
				System.out.println("계정 추가를 선택하셧습니다.");
				System.out.println("계정 아이디와 비밀번호 생성 조건은 다음과 같습니다.");
				System.out.println("아이디는 8자 이상 12자 이하 이며 영문 대소문자와 숫자 이외 특수문자나 공백을 포함할 수 없습니다.");
				System.out.println("비밀번호는 4자 이상 12자 이하 이며 영문 대소문자와 숫자 이외 특수문자(!@#$%^&*_ 만 허용)를 쓸 수 있으며");
				System.out.println("특수문자(!@#$%^&*_)를 1자 이상 4자 이하 반드시 포함시켜야 합니다.");
				System.out.println("상기 조건을 만족시키지 못하는 경우 생성이 불가 하오니 유의하시기 바랍니다.");
				System.out.println();
				System.out.println("새로운 계정을 생성합니다. 순서대로 입력해주세요.");
				System.out.println();

				for (;;) {

					// 시퀀스 0 일 경우 아이디 체크
					if (sequence == 0) {

						System.out.println("아이디 입력 : ");
						scan_id = scan.next();

						if (subf.idValidityCheck(scan_id)) {
							
							if(!subf.sameIdCheck(users, scan_id)) {
								
								sequence = 1;
							}else {
								System.out.println("중복된 아이디가 존재합니다. 다른 아이디를 입력해주세요.");
								
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
							int x = subf.nullCheck(users);
							users[x][0] = scan_id;
							users[x][1] = scan_pass;
							users[x][2] = scan_balance;
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
				}else {
					System.out.println("3명이 넘어가면 더이상 신규가입이 불가합니다. ");
				}
				break;

			case 2:

				System.out.println("잔액을 조회합니다. 아이디와 비밀번호를 입력해주세요.");
				System.out.println("아이디 입력 : ");
				scan_id = scan.next();
				System.out.println("비밀번호 입력 : ");
				scan_pass = scan.next();

				if (subf.sameIdCheck(users, scan_id)) {
					int i = subf.sameIdIndexNum(users, scan_id);
					if (users[i][1].equals(scan_pass)) {
						System.out.println();
						System.out.println("입력하신 계좌의 현재 잔액은 " + users[i][2] + "입니다.");
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

				break;

			case 3:

				System.out.println("지정된 계좌에 입금합니다.");
				System.out.println("아이디와 비밀번호를 입력해주세요.");
				System.out.println("아이디 입력 : ");
				scan_id = scan.next();
				System.out.println("비밀번호 입력 : ");
				scan_pass = scan.next();

				if (subf.sameIdCheck(users, scan_id)) {
					int i = subf.sameIdIndexNum(users, scan_id);
					if (users[i][1].equals(scan_pass)) {
						System.out.println();
						System.out.println("입금할 금액을 입력해주세요 >>");
						int money = subf.intNum(scan);
						if(money==-1) {
							System.out.println("입력횟수 초과!!! 다시 시도해주세요.");
							break;
						}
						
						if(money>0) {
						users[i][2] = Integer.toString(Integer.parseInt(users[i][2])+money);

						System.out.println("입금이 완료되었습니다.");
						System.out.println("잔액 : " + users[i][2]);
						System.out.println();
						}else {
							System.out.println("0보다 큰 금액을 입금 할 수 있습니다. 다시 시도해주세요.");
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
				break;

			case 4:

				System.out.println("지정된 계좌에서 출금합니다.");
				System.out.println("아이디와 비밀번호를 입력해주세요.");
				System.out.println("아이디 입력 : ");
				scan_id = scan.next();
				System.out.println("비밀번호 입력 : ");
				scan_pass = scan.next();

				if (subf.sameIdCheck(users, scan_id)) {
					int i = subf.sameIdIndexNum(users, scan_id);
					if (users[i][1].equals(scan_pass)) {
						System.out.println();
						System.out.println("출금할 금액을 입력해주세요 >>");
						int money = subf.intNum(scan);
						if(money==-1) {
							System.out.println("입력횟수 초과!!! 다시 시도해주세요.");
							break;
						}
						if(money>0) {
						if(Integer.parseInt(users[i][2])-money>=0 ){
						users[i][2] = Integer.toString(Integer.parseInt(users[i][2])-money);

						System.out.println("출금이 완료되었습니다.");
						System.out.println("잔액 : " + users[i][2]);
						System.out.println();
						}else {
							System.out.println("잔액보다 많은 금액을 출금 할 수 없습니다. 다시 시도해주세요.");
						}
						}else {
							System.out.println("0원 이하의 금액을 출금 할 수 없습니다. 다시 시도해주세요.");
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
				break;

			case 5:

				System.out.println("계좌 정보를 삭제합니다.");
				System.out.println("아이디와 비밀번호를 입력해주세요.");
				System.out.println("아이디 입력 : ");
				scan_id = scan.next();
				System.out.println("비밀번호 입력 : ");
				scan_pass = scan.next();

				if (subf.sameIdCheck(users, scan_id)) {
					int i = subf.sameIdIndexNum(users, scan_id);
					if (users[i][1].equals(scan_pass)) {

						users[i][0] = null;
						users[i][1] = null;
						users[i][2] = null;
						
						System.out.println();
						System.out.println("해당 계정이 삭제 되었습니다.");
						System.out.println();

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
				break;

			case 9:
				System.out.println();
				System.out.println("프로그램을 종료합니다. 안녕히 가세요.");
				System.out.println();
				bool = false;
				break;

				
			case 7:
				for(int i=0; i<users.length;i++) {
					for(int j=0;j<users[i].length;j++) {
						System.out.print(users[i][j]+"\t");
					}
					System.out.println();
				}
				
				
				
			default:

				System.out.println();
				System.out.println("메뉴에 주어진 1 ~ 9 숫자 중 하나를 입력해주세요");
				System.out.println();

			}// switch END

		} // while END
		scan.close();
	}// main END

}// class END
