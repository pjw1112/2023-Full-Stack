package pjw;

interface InterA18 {
	ClassA18 methodA();
}

class ClassA18 {
	public ClassA18() {
		System.out.println("Default Constructor :D");
	}
}

public class Test3 {
	public static void main(String[] args) {
		InterA18 test;

		// #1. 익명 클래스
		test = new InterA18() {
			@Override
			public ClassA18 methodA() {
				return new ClassA18();
			}
		};
		test.methodA();

		// #2. 람다 표현식
		test = () -> new ClassA18();

		test.methodA();

		// #3. :: 표현
		// 1. 메서드 사용법
		// 2. 객체(자료형) 생성자
		// 3. 객체(자료형)::메서드
		test = ClassA18::new;
		test.methodA();
	}
}