package com.company.day046;

import java.util.Arrays;

class AA extends Thread {
    public void run() {
        System.out.println("Thread AA is running.");
        try {
            Thread.sleep(1000); // 잠시 대기
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread AA is done.");
    }
}

class BB extends Thread {
    public void run() {
        System.out.println("Thread BB is running.");
        try {
            Thread.sleep(1000); // 잠시 대기
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Thread BB is done.");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
    	
    	Arrays
        AA threadAA = new AA();
        BB threadBB = new BB();

        threadAA.start(); // AA 스레드 시작

        try {
            threadAA.join(); // AA 스레드의 종료를 기다림
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        threadBB.start(); // BB 스레드 시작
    }
}