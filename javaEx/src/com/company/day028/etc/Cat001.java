package com.company.day028.etc;

public class Cat001 {
	private int a;		//동일 클래스 내에서
	protected int b;	//같은 패키지 내에서 + 상속 클래스에서
	int c;				//같은 패키지 내에서
	public int d;
	@Override
	public String toString() {
		return "Cat001 [a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + "]";
	}
	

}
