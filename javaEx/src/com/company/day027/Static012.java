package com.company.day027;

public class Static012 {
	public static void main(String[] args) {
	String str1="monday"; String str2 = "monday"; String str3 = new String("monday");
	for(int i=1; i<6; i++) {System.out.print(i);}
	System.out.println("test1 : "+ ( (str1 == str2)? "같다":"다르다"));
	System.out.println("test2 : "+ ( (str1.equals(str2))? "같다":"다르다"));
	System.out.println("test3 : "+ ( (str1 == str3)? "같다":"다르다"));
	System.out.println("test4 : "+ ( (str1.equals(str3))? "같다":"다르다"));
	System.out.println(System.identityHashCode(str1)); // 3bb712b42
	System.out.println(System.identityHashCode(str2)); // 366712642
	System.out.println(System.identityHashCode(str3)); // 18241b4700
	}// end main
}
