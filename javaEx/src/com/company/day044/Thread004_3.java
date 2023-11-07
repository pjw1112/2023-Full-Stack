package com.company.day044;

class Show4 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub

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

class Show5 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub

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

class Show6 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 5; i++) {
			System.out.println("야옹");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
}

public class Thread004_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] show = { new Thread(new Show4()), new Thread(new Show5()), new Thread(new Show6()) };

		for (Thread thr : show) {
			thr.start();
		}
		
		
	}

}
