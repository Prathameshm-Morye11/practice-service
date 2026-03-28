package com.practice.design.pattern.abstractFDP;

public class AndroidFactory extends EmployeeAbstractFactory{

	@Override
	Employee createEmployeeFactory() {
		// TODO Auto-generated method stub
		return new AndroidDeveloper();
	}

}
