package com.company.day045;

class ThreadA11 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (long i = 0; i < 1000000000; i++) {
		} // 시간 지연용
		if (getName().equals("THREAD[3]")) {
			System.err.println(getName() + ":(\t 우선순위" + getPriority());

		} else {
			System.out.println(getName() + ":(\t 우선순위" + getPriority());
		}

	}
}

public class Thread011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 10; i++) {

			Thread thr = new ThreadA11();
			thr.setName("THREAD[" + i + "]");
			if (i == 3) {
				thr.setPriority(Thread.MAX_PRIORITY);
			} else {
				thr.setPriority(Thread.MIN_PRIORITY);
			}
			thr.start();

		}

	}

}
