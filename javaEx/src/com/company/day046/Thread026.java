package com.company.day046;

class Barista26 extends Thread {
	@Override
	public void run() {

		while (true) {

			System.out.println(getName() + "Making....");
			for (int i = 0; i < 1000000000l; i++) {// 음료 제조중}
			}
		}
	}
}

class User26 extends Thread {
	Barista26 barista;

	public User26(Barista26 barista) {
		this.barista = barista;
	}

	@Override
	public void run() {

		while(true) {
		try {
			System.out.println("고객 이름 : " + getName());
			barista.join(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("고객 이름 : " + getName() + "인터럽트 발생");
			for (int i = 0; i < 1000000000l; i++) {// 시간지연
			}
		}
		
		}
	}
}

public class Thread026 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Barista26 barista = new Barista26();
		barista.setName(">> :D Barista26");
		barista.setDaemon(true);
		
		User26 user		 = new User26(barista);
		user.setName(">> :) Sally");
		user.setDaemon(true);
		
		System.err.println("1. Barista state : "+ barista.getState());
		System.err.println("2. User state : "+ user.getState());
		
		//#
		barista.start();
		user.start();
		
		Thread.sleep(1000);
		
		System.err.println("1. Barista state : "+ barista.getState());
		System.err.println("2. User state : "+ user.getState());
		
		Thread.sleep(10000);
		
	}
}
