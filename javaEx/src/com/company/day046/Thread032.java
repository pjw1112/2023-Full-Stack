package com.company.day046;

class mymy extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {

			System.out.println("헬로 헬로~ 아 헬로~ 헬로~");
			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					break;
				}
				
				
			}
		}

	

}

public class Thread032 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread my = new mymy();
		my.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.err.println("인터럽트");
		my.interrupt();
	}
}
/*
 * 001. Thread 1. 프로세스 : 실행 중인 프로그램 2. 자원 + 쓰레드 (실제작업수행) 3. Thread 상속, Runnable
 * 구현, 익명객체 구현
 * 
 * 
 * 스레드 종료 시키는 방법
 * 
 * 1) boolean 이용 run 메소드 안을 특정 불리언 값에 따라 동작하는 while문으로 감싼 뒤 불리언값을 변경하는 메서드 설정
 * 
 * 2) interrupt 이용 run 메소드 안에 while문, while문 안에 interrupt Exception울 받는 try
 * catch문을 만들고 안에 break;를 걸어준 뒤 스레드 객체.interrupt
 * 
 */