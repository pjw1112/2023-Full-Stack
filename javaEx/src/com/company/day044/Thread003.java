package com.company.day044;

public class Thread003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인 스타트====================");
		// TODO Auto-generated method stub
		// 1. 코어(일꾼수)
		System.out.println("0.코어 : " + Runtime.getRuntime().availableProcessors());
		// 2. 현재 쓰레드 확인
		Thread curThread = Thread.currentThread();
		System.out.println("1. 현재 쓰레드 이름 > " + curThread.getName());
		System.out.println("1. 활성화된 쓰레드 수 > " + Thread.activeCount());

		Thread myshow = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("11첫번째 쓰레드");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			
			
		});

		myshow.start();
		

		for (int i = 0; i < 5; i++) {
			System.out.println("22두번째 쓰레드");
			System.out.println("2. 활성화된 쓰레드 수 > " + Thread.activeCount());
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		System.out.println("메인 엔드====================");
	}

}
