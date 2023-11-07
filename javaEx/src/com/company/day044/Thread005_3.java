package com.company.day044;

class Show9 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub

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

class Show10 implements Runnable {
	@Override
	public void run() {
		// TODO Auto-generated method stub

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

public class Thread005_3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread[] show = { new Thread(new Show9()), new Thread(new Show10()) };

		for (Thread thr : show) {
			thr.start();
			Thread.sleep(30);
		}

	}

}
