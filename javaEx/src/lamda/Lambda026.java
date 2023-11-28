package lamda;

interface Test26 {
	void methodA(int num);
}

public class Lambda026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test26 test1 = new Test26() {
			
			@Override
			public void methodA(int num) {
				// TODO Auto-generated method stub
				System.out.println(num);
			}
		};
		test1.methodA(1);
		
		Test26 test2 =num -> System.out.println(num);
		test2.methodA(2);
		
		Test26 test3 =System.out::println;
		test3.methodA(3);
		
		
		
		
		
		
		
	}

}
