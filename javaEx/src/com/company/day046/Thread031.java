package com.company.day046;

class DonutShop31 {

	int num = 0;

	public synchronized void sell() {

		if (num != 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("판매 중단할끄야");
				
			}
		}

		System.out.println("=== 도넛 판매 중 ===");
		num = 1;
		notify();

	}

	public synchronized void buy() {

		if (num == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("=== 도넛 냠냠 중 ===");
		num = 0;
		notify();

	}

}

public class Thread031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DonutShop31 shop = new DonutShop31();

		Thread selling = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				shop.sell();
			}
		});

		Thread making = new Thread(() -> {
			for (int i = 1; i <= 5; i++) {
				shop.buy();
			}
		});

		selling.start();
		making.start();

	}
}
