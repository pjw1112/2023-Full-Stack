package lamda;

@FunctionalInterface
interface Test6{
	void method();
}


public class Lambda006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test6 teset;
		System.out.println("[1.LAMBDA 표현 1]");
		teset = () -> System.out.println("JAVA LAMBDA :D");
		teset.method();
		
		System.out.println("[2.LAMBDA 표현 2]");
		teset = () -> {System.out.println("JAVA LAMBDA :D");};
		teset.method();
		
		
	}

}
