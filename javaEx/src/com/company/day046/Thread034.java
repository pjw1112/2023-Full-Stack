package com.company.day046;

import javax.swing.*;
import java.text.SimpleDateFormat;

public class Thread034 {

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
					System.out.println("자원 정리");
					System.out.println("실행 종료");
					break;
				}
			}

		}), new Thread(() -> {
			// 프레임 생성
			for (;;) {
				System.out.println("실시간 감시 중...");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					break;
				}
			}
		}) };

		myshow[0].setPriority(10);
		myshow[0].setPriority(1);
		myshow[0].start();
		myshow[1].start();

		String answer = JOptionPane.showInputDialog("실시간 백신검사를 끄시겠습니까?");

		if (answer.trim().toLowerCase().equals("y")) {
			for (int i = 3; i > 0; i--) {
				System.err.println("종료 [" + i + "]초 전");
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			myshow[0].interrupt();
			myshow[1].interrupt();
		}

	}
}
