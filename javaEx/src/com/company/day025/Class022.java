package com.company.day025;

public class Class022 { // 클래스 영역

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserCard022 us = new UserCard022();
		
		
	}
}

class UserCard022{
	int cardNum;
	boolean isMembership;
	static int width;
	static int height;
	
	UserCard022(){
		cardNum=1;
	}
	String info() {
		return cardNum + ((isMembership)?"M":"");
	}
	
	
	
}