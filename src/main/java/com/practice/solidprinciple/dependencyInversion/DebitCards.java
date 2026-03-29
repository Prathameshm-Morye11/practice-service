package com.practice.solidprinciple.dependencyInversion;

public class DebitCards implements BankCard {

	@Override
	public void dotransaction(long amount) {
		// TODO Auto-generated method stub
		System.out.println("Transaction Using Debit card for amount : " + amount);
	}

}
