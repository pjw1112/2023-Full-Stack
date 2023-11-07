package com.company.day006;

public class A003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println( false && true ); //dead code
		System.out.println( true && false );
		System.out.println( true && (10<3));
		System.out.println( (10<=10) && (10>3));
		System.out.println( (10<10) && (10>3));  //dead code
		
		System.out.println( true || true);  //dead code
		System.out.println( true || false);  //dead code
		System.out.println( false || (10<3));
		
		System.out.println(!true);
		System.out.println(!false);
		System.out.println();
		
		System.out.println(true^true);
		System.out.println(true^false);
		System.out.println(false^10>3);
		System.out.println(10<=3^!(10>3));
		System.out.println();
		
		System.out.println( false & true );
		System.out.println( true & false );
		System.out.println( true & true );
		System.out.println(false & false);
		System.out.println();
		int v1=3, v2=3;
		double dd=10.0;
		System.out.println(v1+=3);
		System.out.println(++v1==3);
		System.out.println(v1);
		System.out.println(++dd);
		
		int a=1,b=1,c=1,d=1;
		System.out.println(a);
		
	}

}
