package com.company.day047;

class Thread1 implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("★");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}

public class Thread053 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread th1 = new Thread(new Thread1());
		th1.start();

	}

}
