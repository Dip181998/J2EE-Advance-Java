package com.jspiders.desingpatter.operation;

import com.jspiders.desingpatter.account.Account;

public class Withdraw extends Account {
	
	public double withdraw() {
		System.out.println("withdraw()- accountBalance()");
		return this.withdraw();
		
	}

}
