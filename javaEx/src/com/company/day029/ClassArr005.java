package com.company.day029;

import com.company.day029.etc.MoneyShowVer1;
import com.company.day029.etc.MoneyVer1;

public class ClassArr005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MoneyVer1[] users = new MoneyVer1[] {
				new MoneyVer1("aaa",10000),
				new MoneyVer1("bbb",20000),
				new MoneyVer1("ccc",30000)
		};
		MoneyShowVer1 print = new MoneyShowVer1();
		print.show(users[0]);
		System.out.println();
		print.show(users);
		
		
	}

}
