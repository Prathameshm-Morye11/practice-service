package com.practice.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.practice.bean.Persons;

/**
 * 
 */
public class CollectionGrouping {

	public static void main(String[] args) {

		List<Persons> lstPersons = Arrays.asList(new Persons("Prathamesh", "Morye", "111"),
				new Persons("Prathamesh", "Morye", "111"), new Persons("Satya", "Patil", "222"),
				new Persons("Prathamesh", "Morye", "111"), new Persons("Prathamesh", "Morye", "222"),
				new Persons("Satya", "Patil", "333"), new Persons("Ramesh", "Sawant", "333"));

		Map<String, Object> result = lstPersons.stream()
				.collect(Collectors.groupingBy(p -> p.getFirst_name() + " " + p.getLast_name(),
						Collectors.collectingAndThen(Collectors.toList(),
								lst -> lst.stream().map(Persons::getMobile_number).distinct().count())));

		for (Map.Entry<String, Object> map : result.entrySet()) {
			System.out.println(map.getKey() + "->" + map.getValue());
		}

	}
}
