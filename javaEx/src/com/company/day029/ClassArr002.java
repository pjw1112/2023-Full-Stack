package com.company.day029;

import com.company.day029.etc.Apple;

public class ClassArr002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] color = {"RED","GREEN","GOLD"};
		String[] order = {"iron","hulk","captain"};
		int[] num = {2,1,3};
		int[] price = {1000,1500,2000};
		
		
		Apple[] myApple = new Apple[3];
		
		for(int i=0;i<myApple.length;i++) {
			
			myApple[i]=new Apple();
			myApple[i].setName(color[i]);
			myApple[i].setNum(num[i]);
			myApple[i].setPrice(price[i]);
			myApple[i].setOrder(order[i]);
			
		}
		
		for(Apple item: myApple) {
			
			System.out.println(item.toString());
		}
		
		
		
	}

}
