package com.company.day027;


class Area003{
	public static double pi = 3.14159;
	
	public static double rect(int a, int b) {
		return a*b;
	}
	public static double triangle(int a, int b) {
		return a*b/2;
	}
	
}



public class Static003 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("원의 면적 : " + 10 * 10 * Area003.pi);
		System.out.println("사각형의 면적 : " + Area003.rect(10,5));
		System.out.println("삼각형의 면적 : " + Area003.triangle(10,5));
	}

}
