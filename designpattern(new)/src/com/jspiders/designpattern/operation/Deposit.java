package com.jspiders.designpattern.operation;

import com.jspiders.designpattern.account.Account;

public class Deposit {

	Account account=Account.getObject();	

	public void deposit(double amount) {
		
		System.out.println(amount + " Succeccfully Deposite\n");
		account.accountBalance += amount;
		
		
	}

}
