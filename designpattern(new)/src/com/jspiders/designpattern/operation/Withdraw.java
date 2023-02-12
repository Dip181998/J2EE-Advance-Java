package com.jspiders.designpattern.operation;

import com.jspiders.designpattern.account.Account;

public class Withdraw {

	Account account=Account.getObject();

	public Withdraw(double amount) {
		if (account.accountBalance < amount) {
			System.out.println(" Sorry!! Balance is Insufficient.\n");			
		}else {
			System.out.println(amount+ " withdraw Succeccfully\n");
			account.accountBalance -= amount;			
		}
		
	}

}
