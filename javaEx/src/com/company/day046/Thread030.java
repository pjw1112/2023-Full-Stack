package com.company.day046;

class Barista30 {
	String order;
	int num = 0;

	synchronized void order(String order) throws InterruptedException {

		if (num != 0) {
			wait();
		}
		this.order = order;
		System.out.println("Barista : 주문하신 \"[" + order + "] 음료나왔습니다~!\"");
		num = 1;
		notify();
	}

	void make() throws InterruptedException {
		synchronized (this) {
			if (num == 0) {
				wait();
			}
			System.out.println("User : 주문했던    \"[" + order + "] 가져갑니다~! 감사합니다 ^_^\"");
			num = 0;
			notify();
		}
	}
}

public class Thread030 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barista30 barista = new Barista30();
		String[] coffees = { "아메리카노", "까페라떼", "카푸치노", "바닐라라떼" };

		Thread ordering = new Thread(() -> {
			for (int i = 0;; i++) {
				try {
					barista.order("[ " + i +" ]" + coffees[(int) (Math.random() * 4)]);
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					System.out.println("BARISTA 자원 정리");
					System.out.println("BARISTA 실행 종료");
					break;
				}
			}
		});

		Thread making = new Thread(() -> {
			for (;;) {
				try {
					barista.make();
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					break;
				}
			}
		});

		ordering.start();
		making.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ordering.interrupt();
		making.interrupt();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("[MAIN END!]");

	}
}
