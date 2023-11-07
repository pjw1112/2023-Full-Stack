package com.company.day029.etc;

public class MoneyVer1 {
	private String name;
	private int balance;
	public MoneyVer1() {
		super();
	}
	public MoneyVer1(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "MoneyVer1 [name=" + name + ", balance=" + balance + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
		
	

}
