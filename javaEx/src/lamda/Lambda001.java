package lamda;

@FunctionalInterface
interface Inter1 {

	void method(String str);

}

class Inter1Impl implements Inter1 {

	@Override
	public void method(String str) {
		// TODO Auto-generated method stub
		System.out.println("인터페이스 상속 클래스 객체로 구현 함 str = " + str);
	}

}

public class Lambda001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.err.println("STEP 1.  인터페이스 상속 한 클래스 객체로 구현");
		Inter1 a1 = new Inter1Impl();
		a1.method("안녕");
		System.out.println();
		
		System.err.println("STEP 2.  익명 클래스 객체로 구현");
		Inter1 a2 = new Inter1() {
			@Override
			public void method(String str) {

				System.out.println("익명클래스 객체로 구현함 str = " + str);

			}
		};

		a2.method("2번째 안녕");

	}

}
