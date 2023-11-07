package com.company.day027;

class StaticInit {
	static int sv; //클래스 변수 - 메소드 area - new와 관련 없음
	static {
		sv = 2;
	}
	int iv = 10;  	   // 인스턴스 변수 - heap area - new와 관련 있음
	{
		iv = 20;
	}

	public StaticInit() {
		sv = 3;
		iv = 30;
	}

}

public class Static001 {

	public static void main(String[] args) {
		
		System.out.println(StaticInit.sv);
		
	}
}

