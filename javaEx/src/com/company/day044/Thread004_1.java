package com.company.day044;

public class Thread004_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread[] myshow = {

				new Thread(() -> {
					for (int i = 0; i < 5; i++) {
						System.out.println("꿀꿀");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}

				}), new Thread(() -> {
					for (int i = 0; i < 5; i++) {
						System.out.println("야옹");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}

				}), new Thread(() -> {
					for (int i = 0; i < 5; i++) {
						System.out.println("멍멍");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}

				}) };

		for (Thread thr : myshow) {
			thr.start();
		}

	}

}
