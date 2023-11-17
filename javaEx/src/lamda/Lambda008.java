package lamda;

@FunctionalInterface
interface Test8 {
	int method(int num1, int num2);
}

public class Lambda008 {
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test8 test;

		System.out.println("[ 1. LAMBDA 표현 ]");
		test = (num1,num2) -> num1 + num2; //리턴도 생략 가능
		

		System.out.println(test.method(10, 3));

		System.out.println("[ 2. LAMBDA 표현 ]");
		test = (num1, num2) -> { return add(num1, num2);
		};
		System.out.println(test.method(10, 3));

		
		
		
		System.out.println("[ 3. LAMBDA 표현 ]");
		test = Lambda008::add;
		
		System.out.println(test.method(10, 3));

	}

	

}
