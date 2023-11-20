package lamda;

interface Test24 {
	int methodA(int num1, int num2);
}

public class Lambda024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test24 test1 = new Test24() {

			@Override
			public int methodA(int num1, int num2) {
				// TODO Auto-generated method stub
				return Integer.compare(num1, num2);
			}
		};
		System.out.println(test1.methodA(1, 2));
		System.out.println(test1.methodA(2, 2));
		System.out.println(test1.methodA(3, 2));
		System.out.println();

		Test24 test2 = (int num1, int num2) -> Integer.compare(num1, num2);

		System.out.println(test2.methodA(1, 2));
		System.out.println(test2.methodA(2, 2));
		System.out.println(test2.methodA(3, 2));
		System.out.println();

		Test24 test3 = Integer::compare;

		System.out.println(test3.methodA(1, 2));
		System.out.println(test3.methodA(2, 2));
		System.out.println(test3.methodA(5, 2));
		System.out.println();
		
		
		
	}

}
