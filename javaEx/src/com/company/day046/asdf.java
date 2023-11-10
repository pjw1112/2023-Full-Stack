package com.company.day046;

import javax.swing.JOptionPane;

class Timer35 extends Thread {

	@Override
	public void run() {
		while (true) {
			for (int i = 10; i > 0; i--) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("카운트가 종료되었습니다.");
					break;
				}
			}
		}
	}
}

public class asdf {
	public static void main(String[] args) {
		Thread timer = new Timer35();
		timer.setDaemon(true);
		timer.start();

		String answer = JOptionPane.showInputDialog("사과의 알파벳 ~ 입력하세요");
		if (answer.trim().toLowerCase().equals("apple")) {
			System.out.println("정답~~!!~!~");
			timer.interrupt();

		} else {
			System.out.println("정답이 XXXXXXXXXXXXXXX");
		}
	}
}