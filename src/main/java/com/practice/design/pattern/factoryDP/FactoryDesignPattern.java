package com.practice.design.pattern.factoryDP;

public class FactoryDesignPattern {

	public static void main(String[] args) {
		DeveloperFDP fdpAndroid = EmployeeFactoryFDP.getEmployees("Android Developer");
		System.out.println("Android Developer Salary : " + fdpAndroid.salary());

		DeveloperFDP fdpWeb = EmployeeFactoryFDP.getEmployees("Web Developer");
		System.out.println("Web Developer Salary : " + fdpWeb.salary());
	}
}
