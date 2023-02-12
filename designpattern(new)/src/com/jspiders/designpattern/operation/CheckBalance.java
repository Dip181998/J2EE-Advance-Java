package com.jspiders.designpattern.operation;

import com.jspiders.designpattern.account.Account;

public class CheckBalance {

	Account account=Account.getObject();

	public double checkBalance() {
		return account.accountBalance;
	}

}
