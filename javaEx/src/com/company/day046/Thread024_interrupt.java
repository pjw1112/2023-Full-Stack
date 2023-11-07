package com.company.day046;

class Animal24 extends Thread {
	@Override
	public void run() {
		
		while(true) {
		try {
			System.err.println("1. 고양이 state >>"+ getState());
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			System.err.println("인터럽트");
			System.out.println(getName()+"고양이 깸!");
			for (int i = 0; i < 1000000000l; i++) {
			}
			
		}
		}
	}
}




public class Thread024_interrupt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal24 cat = new Animal24();
		cat.setName("고양이 SLEEP");
		cat.setDaemon(true);
		
		System.out.println("1. 고양이 state >>"+ cat.getState());
		cat.start();
		System.out.println("1. 고양이 state >>"+ cat.getState());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		System.out.println("1. 고양이 state >>"+ cat.getState());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
		}
		
		
	}

}
