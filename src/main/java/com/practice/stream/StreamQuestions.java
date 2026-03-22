package com.practice.stream;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamQuestions {

	public static void main(String[] args) {

		// 1.Separate odd and Even Numbers
		List<Integer> input1 = Arrays.asList(1, 5, 6, 7, 34, 65, 89, 31, 57);
		System.out.println("Output 1 ==>" + input1.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0)));

		// 2. Frequency of each character in String
		String input2 = "GoodMorningTeam";
		System.out.println("Output 2==>" + input2.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		// 3. Sort the list in reverse order
		List<Integer> input3 = Arrays.asList(1, 5, 6, 7, 34, 65, 89, 31, 57);
		System.out.println(
				"Output 3 ==>" + input3.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

		// 4.Print the multiple of 5 from the list
		List<Integer> input4 = Arrays.asList(1, 5, 6, 7, 34, 65, 89, 31, 57);
		System.out.println("Output 4 ==> " + input4.stream().filter(i -> i % 5 == 0).collect(Collectors.toList()));

		// 5.Merge the two unsorted Arrays into the Single sorted array
		int[] input5a = { 5, 3, 56, 78, 32, 90, 21 };
		int[] input5b = { 15, 43, 76, 78, 22, 91, 28 };

		System.out.println("Output 5 ==> "
				+ Arrays.toString(IntStream.concat(Arrays.stream(input5a), Arrays.stream(input5b)).sorted().toArray()));

		// 6.Merge the two unsorted Arrays into the Single sorted array without
		// duplicates
		int[] input6a = { 5, 3, 56, 78, 32, 90, 21 };
		int[] input6b = { 15, 43, 76, 78, 22, 91, 28 };

		System.out.println("Output 6 ==> " + Arrays.toString(
				IntStream.concat(Arrays.stream(input6a), Arrays.stream(input6b)).sorted().distinct().toArray()));

		// 7. Three max and min Numbers from the list
		List<Integer> input7 = Arrays.asList(15, 43, 76, 78, 22, 91, 28, 7, 45, 12);
		List<Integer> maxNumber = input7.stream().sorted().limit(3).collect(Collectors.toList());
		List<Integer> minNumber = input7.stream().sorted(Comparator.reverseOrder()).limit(3)
				.collect(Collectors.toList());

		System.out.println("Output 7 :: Max Three ==> " + maxNumber);
		System.out.println("Output 7 :: Min Three ==> " + minNumber);

		// 8. Sort the list of String in Increasing order of their length
		List<String> input8 = Arrays.asList("Mango", "Banana", "Watermelon", "Chiku", "Apple", "Corn");
		System.out.println("Output 8 ==> "
				+ input8.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList()));

		// 9. Sum and Average of all the elements of an array
		int[] input9 = { 6, 4, 1, 5, 9, 10 };
		System.out.println("Output 9 :: SUM ==>" + Arrays.stream(input9).sum());
		System.out.println("Output 9 :: AVERAGE ==>" + Arrays.stream(input9).average().getAsDouble());

		// 10. Reverse An integer array
		int[] input10 = { 15, 43, 76, 78, 22, 91, 28, 7, 45, 12 };
		System.out.println("Output 10 ==>" + Arrays
				.toString(IntStream.range(0, input10.length).map(i -> input10[input10.length - i - 1]).toArray()));

		// 11. Palindrome Program
		String input11 = "nitin";
		Boolean inPalindrome = IntStream.rangeClosed(1, input11.length() / 2)
				.noneMatch(i -> input11.charAt(i) != input11.charAt(input11.length() - i - 1));
		if (inPalindrome) {
			System.out.println("Output 11 ===> Given String is Palindrome");
		} else {
			System.out.println("Output 11 ===> Given String is not Palindrome");
		}

		// 12. Last element of an array
		int[] input12 = { 15, 43, 76, 78, 22, 91, 28, 7, 45, 76 };
		System.out.println("Output 12 ==> " + Arrays.stream(input12).skip(input12.length - 1).findFirst().getAsInt());

		// 13. Age of Person
		LocalDate dob = LocalDate.of(1997, 07, 11);
		LocalDate currDate = LocalDate.now();

		System.out.println("Output 13 ==> " + ChronoUnit.YEARS.between(dob, currDate));

		// 14. Remove Duplicates elements from list
		List<Integer> input14 = Arrays.asList(15, 43, 76, 78, 22, 91, 28, 7, 78, 15);
		System.out.println("Output 14 ==> " + input14.stream().distinct().collect(Collectors.toList()));

		// 15. Frequency of each element in an array
		List<Integer> input15 = Arrays.asList(15, 43, 76, 78, 22, 91, 28, 7, 78, 15);
		System.out.println("Output 15 ==> "
				+ input15.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

		// 16. Join list of String With Prefix,Suffix and Delimiter
		List<String> input16 = Arrays.asList("Mango", "Banana", "Pineapple");
		System.out.println("Output 16 ==> " + input16.stream().collect(Collectors.joining(",", "[", "]")));

		// 17. Maximum and Minimum in the list
		List<Integer> input17 = Arrays.asList(15, 43, 76, 78, 22, 91, 28, 7, 78, 15);
		System.out.println("Output 17 :: MIN ==> " + input17.stream().sorted().limit(1).findFirst().get());
		System.out.println("Output 17 :: MAX ==> "
				+ input17.stream().sorted(Comparator.reverseOrder()).limit(1).findFirst().get());

		// 18. Anagram Program
		String input18a = "keep";
		String input18b = "peek";

		List<String> a = Stream.of(input18a.split("")).map(String::toLowerCase).sorted().collect(Collectors.toList());
		List<String> b = Stream.of(input18b.split("")).map(String::toLowerCase).sorted().collect(Collectors.toList());

		if (a.equals(b)) {
			System.out.println("Output 18 ==> Both the input Strings are Anagram");
		} else {
			System.out.println("Output 18 ==> Both the input Strings are not a Anagram");
		}

		// 19. Sum of All the digits of a number
		int input19 = 56719;
		System.out.println("Output 19 ==> "
				+ Stream.of(String.valueOf(input19).split("")).collect(Collectors.summingInt(Integer::parseInt)));

		// 20. Second largest Number in an array
		int[] input20 = { 15, 43, 76, 78, 22, 91, 28, 7, 79, 16 };
		System.out.println(
				"Output 20 ==> " + Arrays.stream(input20).sorted().skip(input20.length - 2).findFirst().getAsInt());

		// 21. Common elements between two arrays
		List<Integer> input21a = Arrays.asList(5, 3, 56, 78, 32, 90, 21);
		List<Integer> input21b = Arrays.asList(15, 43, 76, 78, 22, 91, 28);

		System.out.println("Output 21==> " + input21a.stream().filter(input21b::contains).collect(Collectors.toList()));

		// 22. Reverse of each word of String
		List<String> input22 = Arrays.asList("Cricket", "Football", "Hockey", "Bascketball");
		System.out.println("Output 22 ==> "
				+ input22.stream().map(i -> new StringBuffer(i).reverse()).collect(Collectors.toList()));

		// 23. Sum of First 10 Natural Numbers
		System.out.println("Output 23 ==> " + IntStream.range(1, 11).sum());

		// 24. Find Strings which Start with Numbers
		List<String> input24 = Arrays.asList("9Test", "Check", "run", "8deug", "Execute");
		System.out.println("Output 24 ==> "
				+ input24.stream().filter(str -> Character.isDigit(str.charAt(0))).collect(Collectors.toList()));

		// 25. Find the Duplicates elements from an array
		List<Integer> input25 = Arrays.asList(15, 43, 76, 78, 22, 91, 28, 43, 15, 67, 51);
		Set<Integer> set = new HashSet<>();
		System.out.println("Output 25 ==> " + input25.stream().filter(i -> !set.add(i)).collect(Collectors.toSet()));

		// 26. Fibonacci Series
		System.out.println("Output 26 ==>" + Stream.iterate(new int[] { 0, 1 }, f -> new int[] { f[1], f[0] + f[1] })
				.limit(10).map(f -> f[0]).collect(Collectors.toList()));

		// 27. Find the longest string in the list of string
		List<String> string27 = Arrays.asList("apple", "banana", "cherryberrylerry", "date", "grapefruit");

		List<String> result27a = string27.stream().sorted(Comparator.comparing(String::length).reversed()).limit(1)
				.collect(Collectors.toList());
		System.out.println("Result27a ==>" + result27a);

		Optional<String> result27b = string27.stream().max(Comparator.comparing(String::length));
		System.out.println("Result27b ==>" + result27b.get());

		// 28. Calculate the average age of a list of Person objects using Java streams:
		List<Person> persons = Arrays.asList(new Person("Alice", 25), new Person("Bob", 30), new Person("Charlie", 35));

		Double result28 = persons.stream().mapToInt(Person::getAge).average().getAsDouble();

		System.out.println("Result28 ==>" + result28);

		// 29.Find the intersection of two lists using Java streams:
		List<Integer> lst29a = Arrays.asList(3, 4, 31, 56);
		List<Integer> lst29b = Arrays.asList(1, 7, 9, 4);
		List<Integer> result29 = lst29a.stream().filter(lst29b::contains).collect(Collectors.toList());

		System.out.println("Result29 ==>" + result29);

		// 30. Given a list of transactions, find the sum of transaction amounts for
		// each day using Java streams:
		List<Transaction> input30 = Arrays.asList(new Transaction("2022-01-01", 100),
				new Transaction("2022-01-01", 200), new Transaction("2022-01-02", 300),
				new Transaction("2022-01-02", 400), new Transaction("2022-01-03", 500));

		Map<String, Integer> result30 = input30.stream()
				.collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingInt(Transaction::getAmount)));

		System.out.println("Result 30 ==> ");
		for (Map.Entry<String, Integer> map : result30.entrySet()) {
			System.out.println(map.getKey() + " : " + map.getValue());
		}

		// 31.Find the kth smallest element in an array using Java streams
		int[] array31 = { 44, 2, 7, 1, 5, 3, 6 };
		int k = 5;

		int result31 = Arrays.stream(array31).sorted().skip(k - 1).limit(1).findFirst().getAsInt();
		System.out.println("Result 31 ==> " + result31);

	}

}
