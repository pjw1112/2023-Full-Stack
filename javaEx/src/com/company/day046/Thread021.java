package com.company.day046;

class Movie21 {
	String[] all = { "꿀꿀", "야옹", "멍멍" };
	String[] all2 = { "[돼지]", "[걍이]", "[강쥐]" };

	void subtitle2() {// 동기화 메서드
		synchronized (new Object()) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int i = 0; i < 3; i++) {
				System.out.println(all[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	void toolkit2() {
		synchronized (new Object()) {

			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int i = 0; i < 3; i++) {
				System.out.println("<BEEP>");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	void videoFrame() {
		synchronized (new Object()) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			for (int i = 0; i < 3; i++) {
				System.out.println(all2[i]);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	
	
	
	
}

public class Thread021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 공유객체
		Movie21 data = new Movie21();

		// 2개의 스레드에서 공유객체 사용
		Thread mi3 = new Thread(() -> {
			data.toolkit2();

		});
		System.err.println(mi3.getState());   
		mi3.setPriority(10);
		mi3.start();
		System.err.println(mi3.getState());   
		
		Thread mi2 = new Thread(() -> {
			data.subtitle2();

		});
		mi2.setPriority(5);
		mi2.start();

		Thread mi1 = new Thread(() -> {
			data.videoFrame();

		});
		mi1.setPriority(1);
		mi1.start();
		
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println(mi3.getState());   
	}

}
