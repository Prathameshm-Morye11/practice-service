package com.practice.design.pattern.BridgeDP;

public class StripePayment implements PaymentGateway {

	@Override
	public void processAmount(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing Payment ₹ " + amount + " via Stripe");
	}

}
