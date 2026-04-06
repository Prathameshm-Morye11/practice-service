package com.practice.design.pattern.BridgeDP;

public class DebitCardsPaymentyProcess extends Payment {

	public DebitCardsPaymentyProcess(PaymentGateway paymentGateway) {
		super(paymentGateway);
	}

	@Override
	void makePayment(double amount) {
		System.out.println("Payment via Debit cards");
		paymentGateway.processAmount(amount);
	}

}
