package com.practice.design.pattern.abstractFDP;

public class EmployeeFactory {

	public static Employee getEmployee(EmployeeAbstractFactory emplFactory) {

		return emplFactory.createEmployeeFactory();
	}
}
