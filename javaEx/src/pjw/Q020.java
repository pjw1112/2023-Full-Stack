package pjw;

import java.util.Scanner;

public class Q020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int year;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 > ");
		year = sc.nextInt();
		
		// 율리우스력의 윤년 추가 규칙
		// - 4로 나누어 떨어지는 해는 윤년 , 그 밖의 해는 평년으로 한다.
		
		str = (year%4 == 0) ? "윤년" : "평년" ;
		
		System.out.println("율리우스 력으로 "+ str);
		
		// 그레고리력의 윤년 예외 규칙
		// - 100으로 나누어 지고, 400으로 나누어 지지 않는 해는 평년으로 한다.
		
		str = (year%4 == 0) ? 
						       ((year%100 == 0) && !(year%400==0)) ? 
						    		   									"평년" : "윤년"
						    		   													: "평년" ;
		
		
		
		
		
		
		
		
		System.out.println("그레고리 력으로 "+ str);
											
		
		
		
	}

}
