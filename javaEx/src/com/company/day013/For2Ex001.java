package com.company.day013;

public class For2Ex001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// for 버전
		int dice_1 = 1, dice_2 = 1;

		for (dice_1 = 1; dice_1 < 7; dice_1++) {

			for (dice_2 = 1; dice_2 < 7; dice_2++) {

				if (dice_1 + dice_2 == 6)
					System.out.println(dice_1 + "+" + dice_2 + "=" + (dice_1 + dice_2));
			}

		}
		System.out.println();

		// while 버전
		dice_1 = 1;
		dice_2 = 1;

		while (dice_1 < 7) {
			dice_2 = 1;
			while (dice_2 < 7) {

				if (dice_1 + dice_2 == 6)
					System.out.println(dice_1 + "+" + dice_2 + "=" + (dice_1 + dice_2));
				dice_2++;
				;
			}
			dice_1++;
		}
		System.out.println();

		// do while 버전
		dice_1 = 1;
		dice_2 = 1;

		do {
			dice_2 = 1;
			do {

				if (dice_1 + dice_2 == 6)
					System.out.println(dice_1 + "+" + dice_2 + "=" + (dice_1 + dice_2));

				dice_2++;
				;
			} while (dice_2 < 7);

			dice_1++;
		} while (dice_1 < 7);

	}

}
