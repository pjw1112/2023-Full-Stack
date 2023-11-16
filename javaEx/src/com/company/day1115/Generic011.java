package com.company.day1115;

class Test11<T> {
	private T t;

	public T getT() {
		return t;
	}
}

public class Generic011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test11<?> test1 = new Test11<>();
		test1 = new Test11<Number>();
//		test1 = new Test11<float>();
		test1 = new Test11<String>();

		Test11<? extends Number> test2 = new Test11<>();
		test2 = new Test11<Number>();
//		test2 = new Test11<float>(); #6
//		test2 = new Test11<String>(); #7

		Test11<? super Number> test3 = new Test11<>();
		test3 = new Test11<Number>();
//		test3 = new Test11<float>(); #6
//		test3 = new Test11<String>(); #7

//		1. 콜렉션 프레임 워크
//		배열의 단점을 개선한 클래스 객체만 저장가능

	}

}
