package com.company.day046;

class Toilet28 {
	int num;
	boolean isEmpty=true;
	synchronized void inNum(int num) {
		//#1. 빈칸확인 - 빈칸이 아니면 기다려 (wait)
		if( !isEmpty ) { try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   }
		this.num = num; //#2. 빈칸이면 셋팅
		System.out.println("IN USER 번호 [" + num + "]");
		
		//#3. 빈칸 아니야 사람있어
		isEmpty=false;
		
		//#4. 사람썻어 (notify)
		notify();
		
		
	}

	synchronized void outNum() {
		if( isEmpty ) { try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}   }
		System.out.println("OUT USER 번호 [" + num + "]");
		isEmpty=true;
		notify();
	}
}

public class Thread028_waiting_issue {
	public static void main(String[] args) {
		Toilet28 toilet = new Toilet28();

		Thread users_in = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					toilet.inNum(i);
				}
			};
		};

		Thread users_out = new Thread() {
			public void run() {
				for (int i = 1; i <= 5; i++) {
					toilet.outNum();
				}
			};
		};

		users_in.start();
		users_out.start();
	}
}
