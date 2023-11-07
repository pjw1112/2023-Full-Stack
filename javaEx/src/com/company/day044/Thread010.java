package com.company.day044;

class Timer10_1 extends Thread {

	int time;
	public Timer10_1(int time) {
		this.time = time;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 10; i > time; i--) {

			System.out.println(getName() + ":D\t 우선순위" + getPriority());
			System.out.println("[TIMER] - " + i + "초");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

public class Thread010 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("=== 메인 스레드 시작");
		Thread th = new Timer10_1(0);

		th.setDaemon(true);// 데몬 스레드 - 일반 스레드가 모두 종료되면 자동으로 종료
		th.setName("Daemon : ");
		th.start(); // 일반 스레드 - 다른 스레드의 종료여부와 상관없이 자신이 종료되어야 프로세스 종료

		Thread th2 = new Timer10_1(5);

		th2.setDaemon(false);// 데몬 스레드 - 일반 스레드가 모두 종료되면 자동으로 종료
		th2.setName("Daemon : ");
		th2.start();

		//
		// 해결방안1 - 불안정
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=== 메인 스레드 끝");

	}
}
