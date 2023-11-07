package com.company.day046;

// 상태제어1 yield
// 1. [실행]중인 쓰레드의 남은 시간을 우선순위가 높거나 같은 다른 쓰레드에게 [양보]
//	현재쓰레드는 실행대기상태로 들어감

class Animal23 extends Thread {
	public boolean eat = true;

	@Override
	public void run() {
		while (true) {
			System.out.println(getName());
			for (int i = 0; i < 2000000000l; i++) {
			}
			if (eat) {
				// TODO Auto-generated method stub
				
			}else {
				Thread.yield();
			}
		}
	}
}



public class Thread023_yield {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("깊은 산속 옹달샘~! 물을 나눠 먹어요!");

		Animal23 cat = new Animal23();
		cat.setName("고양이가 물을마셔요!");
		cat.setDaemon(true);

		Animal23 dog = new Animal23();
		dog.setName("강아지가 물을마셔요!");
		dog.setDaemon(true);

		System.out.println("1. 고양이 state >>"+ cat.getState());
		System.out.println("2. 강아지 state >>"+ dog.getState());
		
		cat.start();
		dog.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("1. 고양이 state >>"+ cat.getState());
		System.out.println("2. 강아지 state >>"+ dog.getState());
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cat.eat=false;
		System.out.println("======고양이 양보======");
		System.out.println("1. 고양이 state >>"+ cat.getState());
		System.out.println("2. 강아지 state >>"+ dog.getState());
		
		
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		cat.eat=true;
		dog.eat=false;
		System.out.println("======강아지 양보======");
		System.out.println("1. 고양이 state >>"+ cat.getState());
		System.out.println("2. 강아지 state >>"+ dog.getState());
		
		try {
			Thread.sleep(12000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
