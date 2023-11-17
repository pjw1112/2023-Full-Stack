package lamda;

interface InterA16 {
	void methodA(InterB16 b, String str);
}

class InterB16 {
	void methodB(String str) {
		System.out.println(str);
	}
}

public class Lambda008_Ref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// #1. 익명 클래스
		InterA16 test1 = new InterA16() {

			@Override
			public void methodA(InterB16 b, String str) {
				// TODO Auto-generated method stub
				b.methodB(str);
			}
		};

		test1.methodA(new InterB16(), ":D:D"); // 

		// #2. 람다
		InterA16 test2 = (b, str) -> b.methodB(str);
		
		test2.methodA(new InterB16(), ":D:D"); // 

		// #3. :: 표현식
		InterA16 test3 = InterB16::methodB;
		
		test3.methodA(new InterB16(), ":D:D"); //
		
		
		
		
		
		
		
		
		
		
		
		
	}// end main

}// end 객체생성확인
