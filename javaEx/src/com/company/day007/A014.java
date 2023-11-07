package com.company.day007;

public class A014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int money = 54320;
		String money_s =   String.valueOf(money);
		
		System.out.printf("만원 %c장, ",money_s.charAt(0) );
		System.out.printf("천원 %c장, ",money_s.charAt(1) );
		System.out.printf("백원 %c장, ",money_s.charAt(2) );
		System.out.printf("십원 %c장  ",money_s.charAt(3) );
		
		System.out.println();
		
		System.out.printf("만원 %d장, ", money/10000);
		money-=((money/10000)*10000);
		System.out.printf("천원 %d장, ", money/1000 );
		money-=((money/1000)*1000);
		System.out.printf("백원 %d장, ", money/100  );
		money-=((money/100)*100);
		System.out.printf("십원 %d장  ", money/10   );
		
		System.out.println();
		
		money = 54320;
		System.out.printf("만원 %d장, ",money/10000 );
		money%=10000;
		System.out.printf("천원 %d장, ",money/1000  );
		money%=1000;
		System.out.printf("백원 %d장, ",money/100   );
		money%=100;
		System.out.printf("십원 %d장  ",money/10    );
		
		
		
		
	}

}
