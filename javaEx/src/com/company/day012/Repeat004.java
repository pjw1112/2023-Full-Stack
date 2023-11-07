package com.company.day012;

public class Repeat004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10까지 3의 배수 합

		int sum = 0;
		// for
		System.out.printf("1~10까지 3의 배수의 합 : ");
		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0) {
				System.out.printf("%d", i);

				sum = sum + i;

				if (i < 9) {
					System.out.printf(" + ");
				}
			}
		}
		System.out.printf(" = %d", sum);
		System.out.println();

		// while
		System.out.printf("1~10까지 3의 배수의 합 : ");
		int i = 1;
		sum = 0;
		while (i < 11) {
			if (i % 3 == 0) {
				System.out.printf("%d", i);

				sum = sum + i;

				if (i < 9) {
					System.out.printf(" + ");
				}
			}
			i++;
		}
		System.out.printf(" = %d", sum);
		System.out.println();

		// do-while
		System.out.printf("1~10까지 3의 배수의 합 : ");
		i = 1;
		sum = 0;
		do {
			if (i % 3 == 0) {
				System.out.printf("%d", i);

				sum = sum + i;

				if (i < 9) {
					System.out.printf(" + ");
				}
			}
			i++;
		} while (i < 11);
		System.out.printf(" = %d", sum);

	}

}
