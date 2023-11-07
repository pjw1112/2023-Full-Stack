package com.company.day024;

public class MyClass {
	
    
    public static void main(String[] arg) {

    	String str1 ="hello";
    	String str2 = str1;
    	str1="hi";
    	StringBuilder str3=new StringBuilder("hahaha");
    	StringBuilder str4 = str3;
    	str3.delete(1, 5).append("myway");
    	System.out.println(str1);
    	System.out.println(str2);
    	System.out.println(str3);
    	System.out.println(str4);
    }
}
