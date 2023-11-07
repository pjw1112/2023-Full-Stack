package com.company.day027;



public class Static011 {

	int a; //인스턴스변수
	public static String COMPANYNAME="(주) 프로그램 시작부터 종료까지"; //클래스변수
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(COMPANYNAME);
		
		Static011 ss = new Static011();
		
		System.out.println("Static011[a="+ss.a+"]");
		
		
	}

}
