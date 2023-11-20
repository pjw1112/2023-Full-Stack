package lamda;

interface Test23 {
	boolean methodA(String str1, String str2);
}

public class Lambda023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test23 test1 = new Test23() {

			@Override
			public boolean methodA(String str1, String str2) {
				// TODO Auto-generated method stub
				return str1.equals(str2);
			}
		};
		
		System.out.println(test1.methodA("ABC", "abc"));

		Test23 test2 = (str1, str2) -> str1.equals(str2);
		System.out.println(test2.methodA("ABC", "abc"));

		Test23 test3 = String::equals;
		System.out.println(test3.methodA("ABC", "abc"));

	}

}
