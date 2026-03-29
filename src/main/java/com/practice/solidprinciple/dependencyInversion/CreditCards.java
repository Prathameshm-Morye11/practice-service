package com.practice.solidprinciple.dependencyInversion;

public class CreditCards implements BankCard {

	@Override
	public void dotransaction(long amount) {
		// TODO Auto-generated method stub
		System.out.println("Transaction Using Credit cards for amount: " + amount);
	}

}
