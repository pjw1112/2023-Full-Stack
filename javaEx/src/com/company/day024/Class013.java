package com.company.day024;

import java.util.Scanner;

public class Class013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TV a1 = new TV("MBC", 6);
		a1.show();

		TV a2 = new TV("MBC", 6);

		a2.input();
		a2.show();

	}

}

class TV {
	String channel = "MBC";
	int volume = 6;

	{channel="kbs";}
	
	TV(String channel, int volume) {
		// TODO Auto-generated constructor stub
		this.channel = channel;
		this.volume = volume;
	}

	TV() {

	}

	void show() {
		System.out.println("===== TV");
		System.out.println(" TV 채널 : " + channel);
		System.out.println(" TV 볼륨 : " + volume);
	}

	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("::::::::::MYTV");
		System.out.println("TV 채널 입력 > ");
		channel = sc.next();
		System.out.println("TV 볼륨 입력 > ");
		volume = Integer.parseInt(sc.next());
		sc.close();
	}

}
