package com.practice.design.pattern.abstractFDP;

public class AbstractFactoryDesignPattern {

	public static void main(String[] args) {
		Employee e1 = EmployeeFactory.getEmployee(new AndroidFactory());
		System.out.println(e1.name() + " : " + e1.salary());

		Employee e2 = EmployeeFactory.getEmployee(new WebFactory());
		System.out.println(e2.name() + " : " + e2.salary());
	}
}
