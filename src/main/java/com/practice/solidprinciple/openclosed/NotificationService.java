package com.practice.solidprinciple.openclosed;

public interface NotificationService {

	// it state that open for extension and closed for modification
	public void sentOtp();

	public void sendTransactionReport();

}
