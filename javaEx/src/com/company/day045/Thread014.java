package com.company.day045;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class Thread014 {

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
			boolean aa = JOptionPane.showInputDialog("종료할까요").toLowerCase().equals("y");

			if (aa == true) {
				for (int i = 3; i > 0; i--) {
					System.err.println("종료 [" + i + "]초 전");
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					if (i == 1) {
						System.err.println("Terminated");
					}

				}

			} else {

				for (;;) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

			}

		}) };

		myshow[0].setDaemon(true);
		myshow[0].start();
		myshow[1].start();

	}

}
