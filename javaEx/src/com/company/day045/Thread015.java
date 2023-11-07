package com.company.day045;

//#1. Barista15		{ time / getTime, setTime}
class Barista15 {
	private int time;

	public int getTime() {
		return time;
	}

	public synchronized void setTime(int time) throws InterruptedException {
		//# 동기화 블록
		//# synchronized(보장할객체){처리할내용}
		//# 
		synchronized(this) {	//this - 각각의 인스턴스의 지번
		this.time = time;
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName() + ":" + this.time);
		}
	}

}

//#2. Americano15 	{ Batista15 barista }
class Americano15 extends Thread {
	Barista15 barista;

	public Barista15 getBarista() {
		return barista;
	}

	public void setBarista(Barista15 barista) {
		this.setName("Americano15");
		this.barista = barista;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.barista.setTime(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

//#3. Cappuccino15	{ Barista15 barista }
class Cappuccinoe15 extends Thread {
	Barista15 barista;

	public Barista15 getBarista() {
		return barista;
	}

	public void setBarista(Barista15 barista) {
		this.setName("Capppuccino15");
		this.barista = barista;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			this.barista.setTime(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class Thread015 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Barista15 barista = new Barista15();
		
		Americano15 user1 = new Americano15();
		user1.setBarista(barista);
		user1.start();
		
		Cappuccinoe15 user2 = new Cappuccinoe15();
		user2.setBarista(barista);
		user2.start();
		
		

	}

}
