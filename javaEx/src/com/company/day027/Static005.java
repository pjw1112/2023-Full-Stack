package com.company.day027;

class Sawon005 {
	int pay = 10000;
	static int su;
//	static int basicpay = pay; // 정적변수를 인스턴스 변수로 초기화 시도
	static int basicpayZ;
	static {
		basicpayZ = 20000;
	}

	public static void showSu() {
		System.out.println(su);
	}
//	public static void showPay() {
//		System.out.println(this.pay); //정적 메소드에서 인스턴스 변수 사용 
//	}

	public void showAll001() {
		System.out.println(su);
		System.out.println(this.pay);

	}

}

public class Static005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sawon005 ss = new Sawon005();
		System.out.println(ss.su);
		

		
		
	}

}
