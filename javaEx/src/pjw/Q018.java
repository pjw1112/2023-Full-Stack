package pjw;

public class Q018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 범위가 2자리인 숫자의 범주에서 변수의 값 보다 크면서 가장 가까운 10의 배수에서 변수 값을 뺀 나머지
		// = 2자리 정수 의 일의 자리를 10에서 뺀 나머지
		// = 10 - ( x % 10 )
		
		int a = 13;
		int b = 72;
		int c = 25;
		System.out.println( 10-(a%10) );
		System.out.println( 10-(b%10) );
		System.out.println( 10-(c%10) );
		
	}
}
