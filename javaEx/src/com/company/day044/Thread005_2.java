package com.company.day044;

class Show7 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.print(">>");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

class Show8 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 10; i++) {
			System.out.print((i * 10) + 10);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class Thread005_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread[] show = { new Show7(), new Show8() };

		for (Thread thr : show) {
			thr.start();
			Thread.sleep(30);
		}

	}

}
