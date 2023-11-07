package pjw;

public class Q019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 범위가 3자리인 숫자의 범주에서 (100~999) 어떤 숫자가 오든 1의 자리를 1로 변환
		// = 10으로 나눈 나머지를 뺀 다음 다시 +1
		// =  x - ( x % 10 ) + 1		
		int num = 123;
		System.out.println("숫자는 123 >"+ ( num - ( num % 10 ) + 1 )	);
		
		
		
	}

}
