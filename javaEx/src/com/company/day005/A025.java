package com.company.day005;

public class A025 {

	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//q1) 대문자 B는 숫자로 변환시 얼마?
		System.out.println((int)'B');
		//q2) 소문자 a는 숫자로 변환시 얼마?
		System.out.println((int)'a');
		//q3) ''는 숫자로 변환시 얼마?
		System.out.println((int)' ');
		//q4) System.out.println('A'-'a'); 얼마? 32
		System.out.println((int)'A'-(int)'a');
		//q5) 대문자 A를 소문자 a로 변환하시오.
		//	힌트) 대문자A (65), 소문자a(97) a=A 처리해서 소문자 a로 a(97) = A(65) + 32
		System.out.println((char)((int)'A'+32));
		//q6) 다음 주어진 사항을 이용하여 아래의 변수를 이용하여 10 + 3 = 13 게 출력하시오.
			int a = 10; int b = 3; char op ='+';
			System.out.println(""+a+op+b+"="+(a+b));
		
			
		
	}

}

class Mimi{
	
	
	
}
