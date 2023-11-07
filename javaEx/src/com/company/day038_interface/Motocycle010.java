package com.company.day038_interface;

public class Motocycle010 implements Vehicle011, GPS012 {

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("오도바이에 시동을 겁니다");
		search("스타벅스");
	}

	@Override
	public void turnoff() {
		// TODO Auto-generated method stub
		System.out.println("오도보아이에 시동을 끕니다");
	}

	@Override
	public void setSpeed(int speed) {
		// TODO Auto-generated method stub
		System.out.println(">>SPEED : " + speed);
	}

	@Override
	public void search(String destination) {
		// TODO Auto-generated method stub
		System.out.println(destination + "을 안내합니다.");
		setSpeed(120);
		turnoff();

	}

}
