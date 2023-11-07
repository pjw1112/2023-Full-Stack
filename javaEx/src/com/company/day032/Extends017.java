package com.company.day032;

class Animal017 {
	public void eat() {
		System.out.println("식사를 합니다");
	}

	public void sleep() {
		System.out.println("잠을 잡니다");
	}

	public void poo() {
		System.out.println("배변활동을 합니다");
	}

}

class MyCat017 extends Animal017 {
	public static final int NORMAL = 1;
	public static final int DEEP = 2;

	public int sleepMode;

	public MyCat017() {
		sleepMode = NORMAL;
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		if (this.sleepMode == DEEP) {
			System.out.println("딥슬립! WOW~!");
			return;
		}
		super.sleep();
	}
}

public class Extends017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyCat017 sally = new MyCat017();
		sally.poo();
		sally.sleep();
		sally.sleepMode = MyCat017.DEEP;
		sally.sleep();
		sally.sleepMode = MyCat017.NORMAL;
		sally.sleep();
		sally.eat();
		
		
		
		
		
		
	}

}
