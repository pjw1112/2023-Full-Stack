package com.company.day012;

public class RepeatEx001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;

		//for
		for (int i = 0; i < 21; i++) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum = sum + i;
			}
		}
		System.out.println("2또는 3의 배수가 아닌 수의 총합 : " + sum);

		//while
		int i = 0;
		sum=0;
		while( i < 21) {
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum = sum + i;
				
			}
			i++;
		}
		System.out.println("2또는 3의 배수가 아닌 수의 총합 : " + sum);

		
		//do while
		i = 0;
		sum=0;
		do{
			if (!(i % 2 == 0 || i % 3 == 0)) {
				sum = sum + i;
				
			}
			i++;
		}while(i<21);
		System.out.println("2또는 3의 배수가 아닌 수의 총합 : " + sum);

		
		
		
		
		
		
		
	}

}
