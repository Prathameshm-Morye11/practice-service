package com.practice.bean;

import java.util.Objects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee implements Comparable<Employee> {

	private Integer id;
	private String name;
	private Integer age;
	private String company;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof Employee))
			return false;
		Employee e = (Employee) o;
		return id == e.id && age == e.age && Objects.equals(name, e.name) && Objects.equals(company, e.company);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, age, company);
	}

	@Override
	public int compareTo(Employee e) {
		return Integer.compare(this.id, e.id);
	}
}
