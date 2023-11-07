package com.company.day046;

class Timer22 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 3; i > 0; i--) {
			System.out.println("   [TIMER] - " + i + "초");

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}

public class Thread022_state {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread.State state;
		
		//1. 객체 생성 (new)
		Thread timer = new Timer22();
		state = timer.getState();
		System.out.println("1.[Timer]상태"+state);
		
		//2. 실행 대기, 실행 (runnable, Run)
		timer.start();
		state = timer.getState();
		System.out.println("2.[Timer]상태"+state);
		
//		try {
//			Thread.sleep(4000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			timer.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		//3. 종료 (Terminated)
		state = timer.getState();
		System.out.println("3.[Timer]상태"+state);
		
		
		
		
		
	}

}
