package com.company.day024;


public class Class016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserCard002 my = new UserCard002(3,4);
		System.out.println(my.x);
		System.out.println(my.y);
		System.out.println(my.z);
		
		
	}
}


class UserCard002 extends UserCard001{
	int x;
	int y=1;
	int z;
	
	{z=x+y;}
	
	public UserCard002(int a, int b) {
		x=a;
		y=b;
		
		
	}
	public UserCard002(int cardNum,boolean isMembership) {
		super.cardNum=cardNum;
		super.isMembership=isMembership;
		
	}
	public UserCard002() {
		this(1,false);
	}
	
	String info() {
		
		return  Integer.toString(cardNum)+(isMembership?"M":"");  
	}
	
}