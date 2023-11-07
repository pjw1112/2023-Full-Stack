package com.company.day044;

class Show1 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println("꿀꿀");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

class Show2 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println("멍멍");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

class Show3 extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println("꿀꿀");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class Thread004_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] show = { new Show1(), new Show2(), new Show3(), };

		for (Thread thr : show) {
			thr.start();
		}

	}

}
