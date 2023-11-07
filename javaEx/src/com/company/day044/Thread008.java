package com.company.day044;

//// 001. Thread

//0. 프로세스 : 실행중인 프로그램
//1. 자원 + 쓰레드(실제작업수업)
//2. Thread 상속 / Runnable 구현 / 익명객체로 구현

//// 002. Thread Properties
//3. setName / getName  , currentThread, 활성화된 쓰레드 갯수
//4. 우선순위
//5. setDaemon

class ThreadA8 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 0; i < 3; i++) {
			System.out.println(getName()+":D");

			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

public class Thread008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread current = Thread.currentThread();
		System.out.println("1. 현재 스레드 이름 > " + current.getName());
		System.out.println("1. 활성화 된 스레드 수 > " + current.activeCount());
		
		Thread a8 = new ThreadA8();
		a8.start();
		a8.setName("지누쓰레드");
		System.out.println("3. no name > " + a8.getName());
		System.out.println("4. 활성화 된 스레드 수 > " + current.activeCount());
		
		Thread a9 = new ThreadA8();
		a9.start();
		a9.setName("지누쓰레드2");
		System.out.println("5. no name > " + a9.getName());
		System.out.println("6. 활성화 된 스레드 수 > " + current.activeCount());
		
	}

}
