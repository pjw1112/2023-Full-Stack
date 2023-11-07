package com.company.day012;

public class RepeatEx003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1, sum = 0;

		for (;; i++) {
			if (i % 2 == 0) {
				System.out.printf(" ( %d ) + ", -i);
				sum = sum - i;
			} else if (i % 2 != 0) {
				System.out.printf(" %d ", i);
				sum = sum + i;

				if (sum < 100) {
					System.out.printf("+");
				}
			}

			if (sum == 100) {
				break;
			}
		}
		System.out.println(" = "+sum);
		System.out.println("총합이 100이 되는 순간은 "+i);
		
		
		
		

	
	}

}
