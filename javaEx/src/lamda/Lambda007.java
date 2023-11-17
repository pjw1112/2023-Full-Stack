package lamda;

@FunctionalInterface
interface Test7 {
	void method(int a);
}

public class Lambda007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test7 teset;
		System.out.println("[ 1.LAMBDA 표현 ]");
		teset = a -> System.out.println("Rectangle > " + a);
		teset.method(100);
		System.out.println();
		
		System.out.println("[ 2.LAMBDA 표현 ]");
		teset = a -> {
			System.out.println("Rectangle > " + a);
		};
		teset.method(100);
		System.out.println();
		
		System.out.println("[ 3.LAMBDA 표현 ]");
		teset = (a) -> {
			System.out.println("Rectangle > " + a);
		};
		teset.method(100);
		System.out.println();

	}

}
