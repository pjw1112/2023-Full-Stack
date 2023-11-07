package com.company.day023;


class Tv001{
	String name="JTBC";
	int price=5;
	
	void show() {
		System.out.println("========TV");
		System.out.println("TV채널 : "+name+"\nTV볼륨 : "+price);
	}
}

public class Class007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv001 mp1 = new Tv001();
		mp1.show();

	}

}