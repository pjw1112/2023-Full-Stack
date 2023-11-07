package pjw;

public class Q016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char ch ='z';
		
		// ch 변수에 담긴 문자가 영문자(대소 무상관) 이거나 숫자 이면 true 아니라면 false 
		System.out.println( (49<ch && ch<57) || ( 65 <= ch && ch <=122) );
		
		//영문자 범위 65 122
		//숫자 범위 49 57
		
	}

}
