package com.practice.solidprinciple.single;

public class NotificationService {

	// Each class execute only once task
	public void notificationService(String medium) {
		if (medium.equalsIgnoreCase("Email")) {

		} else if (medium.equalsIgnoreCase("SMS")) {

		} else {

		}
	}
}
