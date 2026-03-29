package com.practice.solidprinciple.single;

public class BankLoan {

	//Each class execute only once task
	public void getBankLoan(String loanType) {
		if (loanType.equalsIgnoreCase("Car Loan")) {

		} else if (loanType.equalsIgnoreCase("Home Loan")) {

		} else {

		}

	}
}
