package com.company.day046;

class TimerA extends Thread{
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.err.println("============타이머 A"+(4-i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
}

public class Thread025_join {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread timerA = new TimerA();
		
		for (int i = 0; i < 100; i++) {
			System.out.println("메인 타이머"+(100-i));
			
			
			if (i==10) {
				timerA.start();
				try {
					timerA.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
	}

}
