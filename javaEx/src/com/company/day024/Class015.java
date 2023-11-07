package com.company.day024;

public class Class015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserCard001 card1 = new UserCard001();
		System.out.println("[cardNum=" + card1.cardNum + ", isMembership=" + card1.isMembership + "]");
		System.out.println(card1);

	}

}

class UserCard001 {

	int cardNum;
	boolean isMembership;

	public UserCard001() {
		// TODO Auto-generated constructor stub
		cardNum = 0;
		isMembership = false;
	}

	@Override
	public String toString() {
		return "[cardNum=" + cardNum + ", isMembership=" + isMembership + "]";
	}

	

}