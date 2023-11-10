package com.company.day047;

class Count10 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println((10 - i) + "초");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
		}

	}

}

public class Thread062 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread count = new Count10();
		count.setDaemon(true);
		count.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("메인스레드 종료");
	}

}