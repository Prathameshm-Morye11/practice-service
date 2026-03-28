package com.practice.design.pattern.factoryDP;

public class EmployeeFactoryFDP {

	public static DeveloperFDP getEmployees(String emplType) {

		if (emplType.equalsIgnoreCase("Android Developer")) {
			return new AndroidDeveloperFDP();
		} else if (emplType.equalsIgnoreCase("Web Developer")) {
			return new WebDeveloperFDP();
		} else {
			return null;
		}
	}
}
