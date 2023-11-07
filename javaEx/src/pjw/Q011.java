package pjw;

public class Q011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 0; 
		char ch = '\u0000';
		
		//q1-1    x가 3보다 크고 10보다 작을때 true
		x=5;
		System.out.println("1 : "+ ( 3 < x && x < 10));
		
		//q1-2    ch가 a 또는 A일때 true
		ch='a';
		System.out.println("2 : "+ (ch=='a' || ch=='A'));
		
		//q1-3    ch가 숫자형 문자 0~9 일때 true
		ch='3';
		System.out.println("3 : "+ ( 49 <= ch  && ch <= 57 ));
		System.out.println("3 : "+ ( '0'<= ch  && ch <= '9'));
		
		//q1-4    ch가 대소 무상관 영문자 일때 true
		ch='C';
		System.out.println("4 : "+ ( ( 65 <= ch && ch <= 90 ) || (97 <= ch && ch<=122 ) ));
		System.out.println("4 : "+ ( ( 'A'<= ch && ch <= 'Z') || ('a'<= ch && ch<='z' ) ));
		//대문자 65~90 소문자 97~122
	
		
		
		
	}

}
