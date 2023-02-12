package com.jspiders.designpattern.account;

public class Account {
	 static Account account = new Account(10000);
	public  double accountBalance ;	

	private Account(double accountBalance) {
		
		this.accountBalance = accountBalance;
	}


	public static Account getObject() {
			
		return account;
	}

}
