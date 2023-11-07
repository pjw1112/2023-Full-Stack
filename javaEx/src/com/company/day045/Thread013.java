package com.company.day045;

import javax.swing.JOptionPane;

public class Thread013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] myshow = {

				new Thread(() -> {
					for (int i = 0; i < 50; i++) {
						System.out.println(50 - i);
						try {
							Thread.sleep(1000);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					}

				}), new Thread(() -> {
					// 프레임 생성
					String answer = JOptionPane.showInputDialog("사과의 알파벳을 입력하세요.");

					if (answer != null && answer.trim().toLowerCase().equals("apple")) {
						System.out.println("정답입니다.");
					} else {
						System.out.println("정답이 아닙니다.");
					}

				})

		};
		myshow[0].setDaemon(true);
		myshow[0].start();
		myshow[1].start();

	}

}
