package com.company.day047;

class SubThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("     섭 스레드 시작");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("     섭 스레드 끝");
	}
	
}

public class Thread059 {

	public static void main(String[] args) {

		Thread myThread = new Thread(() -> {

			System.out.println("쓰레드 시작");

			try {
				System.out.println("쓰레드 슬립 시작");
				// 현재 쓰레드를 1초 동안 정지시킴
				Thread.sleep(5000);
				System.out.println("쓰레드 슬립 끝");
			} catch (InterruptedException e) {
				System.err.println("InterruptedException 캐치");
			}

			System.out.println("for문 3개 시작");
			for (int i = 0; i < 1000000000l; i++) {

			}

			for (int i = 0; i < 1000000000l; i++) {

			}

			for (int i = 0; i < 1000000000l; i++) {

			}
			System.out.println("for문 3개 끝");
			
			
			Thread subth = new SubThread();
			subth.start();
			try {
				subth.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			System.out.println("쓰레드 종료");
		});

		myThread.start();

		for (int i = 0;; i++) {
			System.err.println(myThread.getState());

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 6) {
				System.out.println("메인에서 인터럽트 던지기");
				myThread.interrupt();
			}
		}

	}
}