package com.company.day044;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Thread005_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Thread[] myshow = {

				new Thread(() -> {
					for (;;) {

						LocalDateTime currentTime = LocalDateTime.now();

						// 원하는 형식으로 시간을 출력합니다.
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
						String formattedTime = currentTime.format(formatter);

						System.out.println("현재 시간: " + formattedTime);

						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}

				}), new Thread(() -> {

				}) };

		for (Thread thr : myshow) {
			thr.start();
			Thread.sleep(30);
		}
	}

}
