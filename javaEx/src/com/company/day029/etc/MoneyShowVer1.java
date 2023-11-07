package com.company.day029.etc;

public class MoneyShowVer1 {

	public void show(MoneyVer1 money) {

		System.out.println("=========================================================");
		System.out.println(":::::::::::::::::::::: WELCOME! GREEN BANK ::::::::::::::");
		System.out.println("=========================================================");
		System.out.println("[USER] " + money.getName() + "고객님의 정보입니다.");
		System.out.println("잔액 : " + money.getBalance());
	}

	public void show(MoneyVer1[] money) {

		System.out.println("=========================================================");
		System.out.println(":::::::::::::::::::::: WELCOME! GREEN BANK ::::::::::::::");
		System.out.println("=========================================================");
		
		System.out.println("[USER]\tNAME\tBALANCE");
		
		
		for(MoneyVer1 item : money) {
			
			System.out.println("[USER]\t"+item.getName()+"\t"+item.getBalance());
			
		}
		
		
		
	}

}
