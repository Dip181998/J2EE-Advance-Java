package com.jspiders.designpattern.main;

import java.util.Scanner;

import com.jspiders.designpattern.account.Account;
import com.jspiders.designpattern.operation.CheckBalance;
import com.jspiders.designpattern.operation.Deposit;
import com.jspiders.designpattern.operation.Withdraw;

public class BankMain {
	static boolean loop = true;
	public static void main(String[] args) {
		while (loop) {
		Account account = new Account();
		System.out.println(account);
		System.out.println("------Choose Transection------");
		System.out.println("1.Deposit\n" + "2.Withdraw\n" + "3.CheckBalance\n" + "4.Exit");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			Deposit deposit = new Deposit();
			System.out.println("Enter amount ");
			deposit.Deposit(scanner.nextDouble());
			
			break;
		case 2:
			Withdraw withdraw = new Withdraw();
			System.out.println("Enter amount ");
			withdraw.Withdraw(scanner.nextDouble());
			break;
		case 3:
			CheckBalance balance = new CheckBalance();
			balance.checkBalance();
			//System.out.println(account);
			break;

		case 4:
			System.out.println("Thank You");
			scanner.close();
			loop =false;
			break;

		default:
			System.out.println("invalid input");
			break;
			}
		}
	}
}
