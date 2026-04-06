package com.practice.design.pattern.BridgeDP;

public class BridgeDP {

	public static void main(String[] args) {
		PaymentGateway pgCreditCard = new RazorPayPayment();
		CreditCardsPaymentProcess creditCardsPaymentProcess = new CreditCardsPaymentProcess(pgCreditCard);
		creditCardsPaymentProcess.makePayment(5000);

		PaymentGateway pgDebitCard = new StripePayment();
		DebitCardsPaymentyProcess debitCardsPaymentProcess = new DebitCardsPaymentyProcess(pgDebitCard);
		debitCardsPaymentProcess.makePayment(4000);
	}
}
