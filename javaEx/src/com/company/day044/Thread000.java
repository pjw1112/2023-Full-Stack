package com.company.day044;

import java.awt.Toolkit;


// 0. 프로세스 : 실행 중인 프로그램
// 1. 자원 + 쓰레드 ( 실제 작업 수행 )
public class Thread000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 코어(일꾼수)
		System.out.println("0.코어 : "+ Runtime.getRuntime().availableProcessors() );
		// 2. 현재 쓰레드 확인
		Thread curThread = Thread.currentThread();
		System.out.println("1. 현재 쓰레드 이름 > "+ curThread.getName());
		System.out.println("1. 활성화된 쓰레드 수 > "+ Thread.activeCount());
		
		//비프음
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		toolkit.beep();
		//˙Ꙫ˙
		
		for(int i=0;i<5;i++) {
			System.out.println("11첫번째 쓰레드");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		for(int i=0;i<5;i++) {
			System.out.println("22두번째 쓰레드");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		
		
	}

}
