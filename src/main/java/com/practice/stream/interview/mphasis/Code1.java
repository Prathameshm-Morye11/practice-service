package com.practice.stream.interview.mphasis;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Code1 {
	// 1.Find the 2nd Highest salary from Employee
	public static void main(String[] args) {
		List<Employees> lstEmp = Arrays.asList(new Employees("Chetan", 100000), new Employees("Ketan", 300000),
				new Employees("Ramesh", 500000), new Employees("Ganesh", 700000));

		Employees secondHighestSalary = lstEmp.stream().sorted(Comparator.comparing(Employees::getSalary).reversed())
				.skip(1).findFirst().get();

		System.out.println(secondHighestSalary);
	}

}
