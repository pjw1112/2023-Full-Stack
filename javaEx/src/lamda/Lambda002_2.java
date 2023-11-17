package lamda;

interface InterTest21 {
	void hi();
}

interface InterTest22 {
	void hi(int a);
}

interface InterTest23 {
	int hi();
}

interface InterTest24 {
	int hi(int a);
}

public class Lambda002_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 람다식으로 구현하시오.
		// Q1. test1.hi(); //안녕
		InterTest21 test1 =() -> System.out.println("안녕");
		test1.hi();
		// Q2. test2.hi(2); //안녕안녕
		InterTest22 test2 = (a) -> {
		for(int i=0;i<a;i++) {
			System.out.print("안녕");
		}System.out.println();
		};
		test2.hi(2);
		// Q3. System.out.println(test3.hi()); //3
		InterTest23 test3 = () -> {return 3;};
		System.out.println(+test3.hi());
		// Q4. System.out.println(test4.hi(3)); //30
		InterTest24 test4 = (a) -> {return a*10;};
		System.out.println(test4.hi(3));

	}

}
