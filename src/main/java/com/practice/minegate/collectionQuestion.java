package com.practice.minegate;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.practice.bean.Employee;

public class collectionQuestion {

	public static void main(String[] args) {

//		List<Employee> lst = Arrays.asList(new Employee(1, "Prathamesh", 28, "Touras"),
//				new Employee(1, "Prathamesh", 28, "Touras"));

		Employee el = new Employee(1, "Somnath", 34, "Mindgate");
		Employee e2 = new Employee(1, "Somnath", 34, "Mindgate");
		Map<Employee, String> hashMap = new HashMap<>();
		hashMap.put(el, "employee_1");
		hashMap.put(e2, "employee_2");

		System.out.println("HashMap Size -> " + hashMap.size());

		Map<Employee, String> treeMap = new TreeMap<>();
		treeMap.put(el, "employee_1");
		treeMap.put(e2, "employee_2");

		System.out.println("TreeMap Size ---->" + treeMap.size());

	}
}
