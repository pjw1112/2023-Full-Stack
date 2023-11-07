package com.company.day018;

public class Method005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 System.out.println("1. 내가 좋아하는 숫자    :" + return_num());  
	      // 결과물: 1. 내가 좋아하는 숫자    : 1
	      System.out.println("2. 10/3.0을 실수로 표현 :" + return_float());  
	      // 결과물: 2. 10/3.0을 실수로 표현 : 3.3333
	      System.out.println("3. BEST COLOR  :" + mycolor()); 
	      // 결과물: 3. BEST COLOR  : PURPLE
	      System.out.println("4. 장수돌침대 별이       :" + jangsu());
	      // 결과물: 4. 장수돌침대 별이       :  ★★★★★
	      System.out.println("5. 10+20= " + myadd(10,20));   
	      // 결과물: 5. 10+20= 30
	      System.out.println("6. 반(노랑조/주황조)=" + myban('B'));  
	      // 결과물: 6. 반(노랑조/주황조)= 나는 노랑조
	      System.out.println("당신의 학번은?" + stdId(1111));   
	      // 결과물: 당신의 학번은? G1111
	      System.out.println("당신의 평균은?" + stdAvg(88));   
	      // 90~100사이면 A리턴 , 80~90미만 B리턴 , 70~80미만 C리턴 , 그이외 D
	      // 결과물: 당신의 평균은? B
	}
	
	
	public static int return_num() {
		
		return 1;
	}
public static float return_float() {
		
		return (float)(10/3.0);
	}
public static String mycolor() {
	return "pupple";
}
public static String jangsu() {
	return "#######";
}
public static int myadd(int i, int j) {
	return i+j;
}
public static String myban(char ch) {
	return "나는 노랑조";
}
public static int stdId(int i) {
	return i;
}
public static String stdAvg(int i) {
	String str="";
	
	if(i>90) {
		str="A";
	}else {
		str="B";
	}
	return str;
}


	
	
	
	
}
