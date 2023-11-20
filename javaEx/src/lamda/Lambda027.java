package lamda;

interface Test27{
	double methodA();
}

public class Lambda027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test27 test1 = () -> Math.random();
		System.out.println(test1.methodA());
		
		Test27 test2 = Math::random;
		System.out.println(test2.methodA());
		
		
		
		
		
	}

}
