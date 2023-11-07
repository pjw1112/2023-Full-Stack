package com.company.day045;

public class Thread012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread[] myThr = {

				new Thread(() -> {

					try {
						Thread.sleep(10);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					for (int i = 0; i < 5; i++) {
						System.out.print(">>");
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
				}),

				new Thread(() -> {
					try {
						Thread.sleep(30);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					for (int i = 0; i < 10; i++) {
						System.out.print((i * 10) + 10);
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}
				}) };

		myThr[0].setPriority(10);
		myThr[1].setPriority(1);
		myThr[1].setDaemon(true);
		;
		myThr[0].start();
		myThr[1].start();

	}
}
