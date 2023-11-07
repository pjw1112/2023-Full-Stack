package com.company.day038_interface;

interface Vehicle008{
	int MAX_SPEED = 400;
	int MIN_SPEED = 0;
	void start();
	void turnoff();
	void setSpeed(int speed);
	
	default void myAdd(){
		System.out.println("요건 디폴트 메서드랑께?");
	};
}

class Vson extends Object implements Vehicle007{
	
}

public class interface008 implements Vehicle008 {
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	@Override public void turnoff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Vehicle008.MAX_SPEED);
		System.out.println(interface008.MAX_SPEED);
		interface008 aa = new interface008();
		aa.myAdd();
	}
}
