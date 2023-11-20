package lamda;

interface InterA18 {
	ClassA18 methodA();
}

class ClassA18 {
	ClassA18() {
		System.out.println("default constructor :D");
	}
}

public class Lambda018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterA18 test;
		
		test = () -> new ClassA18();
		
		test.methodA();
		
		test = ClassA18::new;
		
	}

}
