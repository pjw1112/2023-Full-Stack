package com.company.day044;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class Thread007 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread[] myshow = { new Thread(() -> {
			for (;;) {
				SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
				System.out.println(sdf.format(System.currentTimeMillis()));
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}

		}), new Thread(() -> {
			// 프레임 생성
			int answer = Integer.parseInt(JOptionPane.showInputDialog("몇 초 뒤 종료할까요."));

			for (int i = answer; i > 0; i--) {
				System.out.println("종료 [" + i + "]초 전");
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
