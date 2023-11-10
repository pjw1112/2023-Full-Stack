package com.company.day046;

class RestRoom27 {

	// ##1. class Toilet
	class Toilet {
		void toiletUsing() {
			synchronized (this) {
				
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("Toilet 사용 유저 [" + Thread.currentThread().getName() + "]");
				System.out.println("First - " + first.getState()
						+ (first.getState().equals(Thread.State.RUNNABLE) ? "(###)" : ""));
				System.out.println("Second - " + second.getState()
						+ (second.getState().equals(Thread.State.RUNNABLE) ? "(###)" : ""));
				System.out.println("Third - " + third.getState()
						+ (third.getState().equals(Thread.State.RUNNABLE) ? "(###)" : ""));
				System.out.println();
			} 

		}
	}

	// ##2. Toilet ( 공유객체 )
	Toilet toilet = new Toilet();

	// ##3. 유저3 ( 화장실이용 )
	Thread first = new Thread("First") {
		public void run() {
			toilet.toiletUsing();
		}
	};

	Thread second = new Thread("Second") {
		public void run() {
			toilet.toiletUsing();
		}
	};

	Thread third = new Thread("Third") {
		public void run() {
			toilet.toiletUsing();
		}
	};

	// ##4. startThreads ( )
	void startThreads() {
		first.start();
		second.start();
		third.start();
	}
}

public class Thread027 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new RestRoom27().startThreads();

	}
}
