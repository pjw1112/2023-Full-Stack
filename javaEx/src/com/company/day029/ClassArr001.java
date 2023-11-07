package com.company.day029;

public class ClassArr001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ADto a1 = new ADto();
		
		int[] a21 = new int[3];
		
		System.out.println(a21.toString());
		System.out.println(a21[0]);
		
		
		System.out.println();
		ADto[] a22 = new ADto[3];
		
		System.out.println(a22.toString());
		System.out.println(a22[0]);
		
		a22[0] = new ADto("jin", 27);
		a22[1] = new ADto("jin", 27);
		a22[2] = new ADto("jin", 27);
		
		System.out.println(a22[0].getAge());
		
		
		System.out.println();
		for(ADto item : a22) {
			
			System.out.println(item.toString());
		}
		
		
		
		
	}

}
