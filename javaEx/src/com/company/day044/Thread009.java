package com.company.day044;



class ThreadA9 extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub

//		for (int i = 0; i < 1000000000; i++) {}
		if (getName().equals("New thread3")) {
			System.err.println(getName() + ":D\t 우선순위" + getPriority());

		} else {
			System.out.println(getName() + ":D\t 우선순위" + getPriority());
		}

		/*
		 * try { Thread.sleep(200); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } }
		 */

	}
}

public class Thread009 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.코어 수 (일꾼 수) : " + Runtime.getRuntime().availableProcessors());
		System.out.println();
		System.out.println();

//		for (int i = 1; i < 11; i++) {
//			Thread thread = new ThreadA9();
//			thread.setName("Smile"+i);
//			thread.start();
//		}
//		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("2. 활성화 된 스레드 수 > " + Thread.activeCount());
		System.out.println("3. 우선순위 최대 > " + Thread.MAX_PRIORITY);
		System.out.println("3. 우선순위 최대 > " + Thread.MIN_PRIORITY);

		// STEP 3. 우선순위 직접 지정
		for (int i = 1; i < 1000; i++) {
			Thread thread = new ThreadA9();
			thread.setName("New thread" + i);
			if (i == 3) {
				thread.setPriority(10);
			}
			thread.start();
		}

	}

}
