package com.practice.solidprinciple.dependencyInversion;

public class ShoppingMall {
	private BankCard bankCard;

	public ShoppingMall(BankCard bankCard) {
		this.bankCard = bankCard;
	}

	public void doPurchaseSomething(long amount) {
		bankCard.dotransaction(amount);
	}

	public static void main(String[] args) {

		BankCard bankCards = new CreditCards();
		ShoppingMall shoppingMall = new ShoppingMall(bankCards);
		shoppingMall.doPurchaseSomething(5000);
	}
}
