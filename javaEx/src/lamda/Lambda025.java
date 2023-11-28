package lamda;

interface Test25 {
	AnimalCard methodA();
}

class AnimalCard {
	AnimalCard() {
		System.out.println("MY FRIENDS"+":D".repeat(Lambda025.aa++));
	}
}

public class Lambda025 {
	static int aa=1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test25 test1 = new Test25() {
			
			@Override
			public AnimalCard methodA() {
				// TODO Auto-generated method stub
				return new AnimalCard();
			}
		};
		
		test1.methodA();
		
		Test25 test2 = () -> new AnimalCard();
		
		test2.methodA();
		
		Test25 test3 = AnimalCard::new;
		
		test3.methodA();
			
	}

}
