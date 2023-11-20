package lamda;

interface Test20a {
	int methodA(String str);
}

public class Lambda020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test20a test11 = new Test20a() {
			@Override
			public int methodA(String str) {
				// TODO Auto-generated method stub
				return str.length();
			}
		};
		System.out.println(test11.methodA("ABC"));

		Test20a test12 = str -> str.length();
		System.out.println(test12.methodA("ABC"));
		
		Test20a test13 = String::length;
		System.out.println(test13.methodA("ABC"));
		
		
		
		
		
		
		
	}

}
