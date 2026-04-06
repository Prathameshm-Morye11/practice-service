package com.practice.design.pattern.BridgeDP;

abstract class Payment {

	PaymentGateway paymentGateway;

	public Payment(PaymentGateway paymentGateway) {
		this.paymentGateway = paymentGateway;
	}

	abstract void makePayment(double amount);
}
