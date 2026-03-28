package com.practice.design.pattern.abstractFDP;

public class WebFactory extends EmployeeAbstractFactory {

	@Override
	Employee createEmployeeFactory() {
		// TODO Auto-generated method stub
		return new WebDeveloper();
	}

}
