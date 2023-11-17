package lamda;

interface Test20 {
	int methodA(String str);
}

class Bbb{
	
	static int length(String str) {
		
		return str.length();
	}
}

class Ccc{
	Test20 test1 = Bbb::length;
}

public class Lambda020_Ref_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test20 test1 =str -> str.length(); 
		System.out.println(test1.methodA("안녕하세요"));
				
//		test1 = Bbb::length;
		System.out.println(test1.methodA("안녕하세요"));
		
		Test20 test1 = System.out::print;
		
		
		
		
		
		
		
		
		
	}

}
