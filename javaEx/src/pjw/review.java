package pjw;

import java.util.Scanner;

public class review {

	public review() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//변수
		int x, y;
		String z = "";
		char ch;
		Scanner sc = new Scanner(System.in);
		
		//입력
		System.out.println("1. 정수 하나 입력 > ");
		x = sc.nextInt();
		System.out.println("2. 정수 하나 입력 > ");
		y = sc.nextInt();
		System.out.println("3. 연산자 입력 ");
		ch = sc.next().charAt(0);
		
		//처리

			//if 버전
			if (ch == '+') {
				z = Integer.toString(x+y);
			} else if (ch == '-') {
				z = Integer.toString(x-y);
			} else if (ch == '/') {
				z = String.format("%.2f", (float)x/y);
			} else if (ch == '*') {
				z = Integer.toString(x*y);
			}
		
	
			//switch 버전
			switch(ch) {
			case '+': z = String.format("%d", x+y); break;
			case '-': z = String.format("%d", x-y); break;
			case '/': z = String.format("%.2f", (float)x/y); break;
			case '*': z = String.format("%d", x*y); break;
			
			}
			
		//출력
		System.out.println("" + x + ch + y + "=" + z);

	}

}
