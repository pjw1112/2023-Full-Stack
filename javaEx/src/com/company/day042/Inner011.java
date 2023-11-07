package com.company.day042;

class Outer011 {
	private String user;

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	class Inner1 {
		final static String company = "(주)컴퍼니";
		String num = "";
		String company_number = "2020-05-";
		Inner1() {
			for (int i = 0; i < 5; i++) {
				num += (int)(Math.random() * 10);
			}
			company_number += num;
		}
		
	}

	class Inner2 {
		String num2 = "";
		String product_serial = "p-";
		Inner2() {
			for (int i = 0; i < 5; i++) {
				num2 += (int)(Math.random() * 10);
			}
			product_serial += num2;
		}
		
	}
}

public class Inner011 {
public static void main(String[] args) {
	Outer011 user1 = new Outer011();
	user1.setUser("홍길동");
	Outer011.Inner1 inner1 = user1.new Inner1();
	Outer011.Inner2 inner2 = user1.new Inner2();
	System.out.println("-사용자 명 : " + user1.getUser() );
	System.out.println("-회 사 명 : " + Outer011.Inner1.company);
	System.out.println("-사업자 등록번호 : " + inner1.company_number );
	System.out.println("-제품 시리얼 번호 : " + inner2.product_serial );
	
	
	
}
	
}
