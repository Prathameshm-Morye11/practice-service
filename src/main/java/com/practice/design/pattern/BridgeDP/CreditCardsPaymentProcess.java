package com.practice.design.pattern.BridgeDP;

public class CreditCardsPaymentProcess extends Payment {

	public CreditCardsPaymentProcess(PaymentGateway paymentGateway) {
		super(paymentGateway);
	}

	@Override
	void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment via Credit Card");
		paymentGateway.processAmount(amount);
	}

}
