package com.company.day048;

class Mydata {
	String str;
	boolean bool=true;

	synchronized void StrSet(String str) {

		if(!bool) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
			
		this.str = str;
		System.out.println("mydata 에 [ " + str + " ] 저장");
		bool=false;
		notify();
	}

	synchronized void StrGet() {
		if(bool) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			
		System.err.println("mydata 에서 [ " + str + " ] 가져옴 ★");
		bool=true;
		notify();
	}

}

class User1 extends Thread {

	Mydata data;

	public User1(Mydata data) {
		this.data = data;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			data.StrSet(i + "번 데이터");
		}
	}
}

class User2 extends Thread {

	Mydata data;

	public User2(Mydata data) {
		this.data = data;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			data.StrGet();
			
		}
	}
}

public class Thread_repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mydata data = new Mydata();
		User1 user1 = new User1(data);
		User2 user2 = new User2(data);

		
		user2.start();
		user1.start();
	}

}
