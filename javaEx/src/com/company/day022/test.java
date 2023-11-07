package com.company.day022;

import java.util.Scanner;

public class test {
// me_1 메서드는 스캐너를 이용해 숫자를 입력받습니다.
// 입력받은 숫자가 2일때 메서드를 종료하고 2를 리턴합니다.
// 그런데 해당 메서드의 마지막 줄에 scanner객체 .close() 를 넣으면 
// 메인 메서드 for문에 의해 me_1메서드가 두번째 호출될때 에러가 발생하며 프로그램이 멈추는 것 같습니다.
	
	
// 질문1. NoSuchElementException()발생 이유
// 질문2. 임의로 사용하기 위해 만든 메서드 내에서 Scanner객체를 생성할경우 .close()를 쓰면 안되는 것인지
// 질문3. 써도 된다면 2개 이상의 메서드에서 각자 Scanner 객체를 생성했을때 .close()를 어디다 쓰는것인지	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (;;) {
			int a = 0;
			System.out.println("메인 메서드 시작");
			a = me_1();

			System.out.println("메인 메서드 종료, 입력받은 숫자 : " + a);
		}

	}

	static int me_1() {

		int i = 0;
		Scanner scan = new Scanner(System.in);
		for (;;) {

			try {
				System.out.println("숫자를 입력하세요 >");
				i = scan.nextInt();

			} catch (Exception e) {
				// TODO: handle exception
				scan.next();
				System.out.println("int형 정수만 입력가능");
			}
			System.out.println("입력한 숫자" + i);
			if (i == 2)
				break;

		}
		// 아래 코드 활성시 throw new NoSuchElementException(); 예외 발생합니다.
		// scan.close();

		return i;

	}
	

	

}
