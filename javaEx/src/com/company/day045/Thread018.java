package com.company.day045;

class Rank {
	int num = 0;

	public synchronized void plusnum() {
		int rank = num;

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		num = rank + 1;
	}
}

class User extends Thread {
	Rank rank;

	public User(Rank rank) {
		this.rank = rank;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		rank.plusnum();
		System.out.println(rank.num + "등 >>" + getName());
	}

}

public class Thread018 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Rank rank = new Rank(); // 공유 객체 생성

		for (int i = 0; i < 10; i++) {
			Thread user1 = new User(rank);
			user1.setName("["+i+"]번째 쓰레드");
			user1.setPriority(i+1);
			user1.start();
		}

	}

}
