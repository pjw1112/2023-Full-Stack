package lamda;

interface InterAA16 {
	void methodA(InterBB16 b, String str ,String str2);
}

class InterBB16 {
	void methodB(String str, String str2) {
		System.out.println(str+str2);
	}
}

interface InterAA16Q {
	void methodA( String str, InterBB16 b);
}


public class Lambda016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterAA16 test;
		test =(b, str, str2) -> b.methodB(str,str2);
		
		test.methodA(new InterBB16(), ":D", "hi");
		
		
		test = InterBB16::methodB;
		//인터페이스 메서드의 첫번째 파라미터가 객체, 그 뒤의 파라미터가 객체 메서드의 파라미터면
		// :: 축약 가능
		
		InterAA16Q question;
		question = (str, b) -> b.methodB(str); 
		question.methodA(":D".repeat(3), new InterBB16());
		
//		question = InterBB16::methodB;
		
		
		
		
	}

}
