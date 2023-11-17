package lamda;

interface InterA2 {
	void hi();
}

interface InterB2 {
	void hi(String name);
}

interface InterC2 {
	String hi();
}

interface InterD2 {
	int hi(int num, int num2);
}

public class Lambda002_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("[STEP1] 매개변수x, 리턴x");

		// 익명객체로 표현
		InterA2 intA2_1 = new InterA2() {

			@Override
			public void hi() {
				// TODO Auto-generated method stub
				System.out.println("hi");
			}
		};
		intA2_1.hi();

		// 람다식으로 표현
		InterA2 intA2_2 = () -> {
			System.out.println("hi");
		};
		intA2_2.hi();
		System.out.println();

		System.out.println("[STEP2] 매개변수o, 리턴x");

		// 익명객체로 표현
		InterB2 intB2_1 = new InterB2() {

			@Override
			public void hi(String name) {
				// TODO Auto-generated method stub
				System.out.println("hi " + name);
			}
		};
		intB2_1.hi("진우");

		// 람다식으로 표현
		InterB2 intB2_2 = name -> System.out.println("hi " + name);
		intB2_2.hi("진우");
		System.out.println();

		System.out.println("[STEP3] 매개변수x, 리턴o");

		// 익명객체로 표현
		InterC2 intC2_1 = new InterC2() {

			@Override
			public String hi() {
				// TODO Auto-generated method stub

				return "안뇽";
			}
		};
		System.out.println(intC2_1.hi());

		// 람다식으로 표현
		InterC2 intC2_2 = () -> {
			return "안녕";
		};

		System.out.println(intC2_2.hi());
		System.out.println();

		System.out.println("[STEP4] 매개변수o, 리턴o");
		
		// 익명객체로 표현
		InterD2 intD2_1 = new InterD2() {
			
			@Override
			public int hi(int num, int num2) {
				// TODO Auto-generated method stub
				
				return num+num2;
			}
		};
		System.out.println("안녕"+intD2_1.hi(5, 10));
		
		// 람다식으로 표현
		InterD2 intD2_2 = (num, num2) -> {return num+num2;};
		
		System.out.println("안녕"+intD2_2.hi(5, 10));
		
		
		
		
		
		
		

	}

}
