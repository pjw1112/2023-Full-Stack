package com.company.day038_interface;

interface Vehicle007{
	int MAX_SPEED = 400;
	int MIN_SPEED = 0;
}



public class interface007 implements Vehicle007{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MAX_SPEED = 10; // final 이라서 변경 불가 
		System.out.println(MAX_SPEED);
		System.out.println(MIN_SPEED);
		
	}

}
