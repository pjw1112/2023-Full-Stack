package com.company.day045;

//싱크로나이즈드의 문제점



//#1. Barista15		{ time / getTime, setTime}
class Barista19 {
	
	synchronized void order(){//동기화 메서드
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("[ORDER]"+ i + "개");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	void make(){
		synchronized (new Object()) {
			
		
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < 6; i++) {
			System.out.println("[MAKE]"+ i + "개");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	}
	


}


public class Thread019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//공유객체
		Barista19 barista = new Barista19();
		
		//2개의 스레드에서 공유객체 사용
		
		new Thread(() -> {
			barista.make();
			
		}).start();
		
		new Thread(() -> {
			barista.make();
			
		}).start();
		
		
		
		
		
		
		
		
		
		
	}

}
