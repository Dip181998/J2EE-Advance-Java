package com.jspiders.designpattern.operation;

import com.jspiders.designpattern.account.Account;

public class Deposit {

	public void Deposit(double amount) {
		System.out.println("deposit amount "+ amount + " in the bank");
		Account.accountBalance += amount;
		System.out.println("total accountbalace :"+ Account.accountBalance);
		
	}

}
