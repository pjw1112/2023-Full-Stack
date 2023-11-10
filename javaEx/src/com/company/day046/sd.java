package com.company.day046;

class Hello33_2 extends Thread {
    @Override
    public void run() {
        while (true) { //
            System.out.println("Hello~");
            for (long i = 0; i < 1000000000L; i++) {
            } //프로그램 처리시간
            if (Thread.interrupted()) {
                System.out.println("스레드 인터럽트 당핸냐? > " + Thread.interrupted());
                break;
            }
        }//end while
    }
}// end class

public class sd{
    public static void main(String[] args) {
        //#1. 객체 시작
        System.out.println("[MAIN] - START");
        Thread hello = new Hello33_2();   //부모 = 자식 업캐스팅, 타입캐스팅
        hello.start();

        //#2. 시작확인 - 지연
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        hello.interrupt(); //#1.

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("[MAIN] - END");
    }
}