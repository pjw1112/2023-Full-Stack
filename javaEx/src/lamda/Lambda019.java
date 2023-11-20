package lamda;

interface InterA19{
	ClassA19 methodA(int num);
}
class ClassA19{
	
	ClassA19(int num) {
		System.out.println("constructor"+":D".repeat(num));
	}
}

public class Lambda019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		InterA19 test = num -> new ClassA19(num);
		test.methodA(2);
				
				
				
				
			
				
				
				
				
				
		test = ClassA19::new;
		
		test.methodA(3);
		
		
		
	}

}
