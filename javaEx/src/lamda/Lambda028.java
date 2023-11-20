package lamda;

interface Test28 {
	String methodA(String str);
}

public class Lambda028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test28 test1 = new Test28() {
			@Override
			public String methodA(String str) {
				// TODO Auto-generated method stub
				return str.toLowerCase();
			}
		};
		System.out.println(test1.methodA("ABC"));

		Test28 test2 = str -> str.toLowerCase();
		System.out.println(test2.methodA("ABC"));

		Test28 test3 = String::toLowerCase;
		System.out.println(test3.methodA("ABC"));

	}

}
