package com.practice.steamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.practice.dto.Bar;
import com.practice.dto.Foo;
import com.practice.dto.Person;

public class SteamAPIMain {

	public static void main(String[] args) {

		List<String> strList = new ArrayList<>();

		strList.add("a");
		strList.add("bd");
		strList.add("bc");
		strList.add("c");

		// Filter

		strList.stream().filter(s -> s.startsWith("b")).forEach(System.out::print);
		System.out.println("");

		// Sorterd
		strList.stream().sorted().filter(s -> s.startsWith("b")).forEach(System.out::print);
		System.out.println("");

		Arrays.asList("a1", "a2", "a3").stream().findFirst().ifPresent(System.out::println);

		Stream.of("a1", "a2", "a3").findFirst().ifPresent(System.out::println);

		IntStream.range(1, 4).forEach(System.out::println);

		Arrays.stream(new int[] { 1, 2, 3 }).map(n -> 2 * n + 1).average().ifPresent(System.out::println);

		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).forEach(System.out::println);

		Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max()
				.ifPresent(System.out::println);

		IntStream.range(1, 4).mapToObj(i -> "a" + i).forEach(System.out::println);

		Stream.of(1.0, 2.0, 3.7).mapToInt(Double::intValue).mapToObj(i -> "a" + i).forEach(System.out::println);

//		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
//			System.out.println("filter: " + s);
//			return true;
//		}).forEach(s -> System.out.println("forEach: " + s));

//		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
//			System.out.println("filter: " + s);
//			return true;
//		}).allMatch(s -> {
//			System.out.println("anyMatch: " + s);
//			return true;
//		});

		Stream.of("d2", "a2", "b1", "b3", "c").map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		}).anyMatch(s -> {
			System.out.println("anyMatch: " + s);
			return s.startsWith("A");
//			return true;
		});

		System.out.println("\n** order ** ");
		Stream.of("d2", "a2", "b1", "b3", "c").map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		}).filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("A");
		}).forEach(s -> System.out.println("forEach: " + s));

		System.out.println("\n** order 2 ** ");
		Stream.of("d2", "a2", "b1", "b3", "c").filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("a");
		}).map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		}).forEach(s -> System.out.println("forEach: " + s));

		System.out.println("\n** Sorted 1 ** ");
		Stream.of("d2", "a2", "b1", "b3", "a1").sorted((s1, s2) -> {
			System.out.printf("sort: %s; %s\n", s1, s2);
			return s1.compareTo(s2);
		}).filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("a");
		}).map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		}).forEach(s -> System.out.println("forEach: " + s));

		System.out.println("\n** Sorted 2 ** ");
		Stream.of("d2", "a2", "b1", "b3", "a1").filter(s -> {
			System.out.println("filter: " + s);
			return s.startsWith("a");
		}).sorted((s1, s2) -> {
			System.out.printf("sort: %s; %s\n", s1, s2);
			return s1.compareTo(s2);
		}).map(s -> {
			System.out.println("map: " + s);
			return s.toUpperCase();
		}).forEach(s -> System.out.println("forEach: " + s));

		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));

		List<Person> filtered = persons.stream().filter(p -> p.getName().startsWith("P")).collect(Collectors.toList());

		System.out.println(filtered);

		Map<Integer, List<Person>> personsByAge = persons.stream().collect(Collectors.groupingBy(p -> p.getAge()));

		personsByAge.forEach((age, p) -> System.out.format("age %s: %s\n", age, p));

		Double averageAge = persons.stream().collect(Collectors.averagingInt(p -> p.getAge()));

		System.out.println(averageAge);

		IntSummaryStatistics ageSummary = persons.stream().collect(Collectors.summarizingInt(p -> p.getAge()));

		System.out.println(ageSummary);

		String phrase = persons.stream().filter(p -> p.getAge() >= 18).map(p -> p.getName())
				.collect(Collectors.joining(" and ", "In Germany ", " are of legal age."));

		System.out.println(phrase);

//		Map<Integer, String> map = persons.stream()
//				.collect(Collectors.toMap(p -> p.age, p -> p.name, (name1, name2) -> name1 + ";" + name2));
//
//		System.out.println(map);

		System.out.println("FlatMap");
		List<Foo> foos = new ArrayList<>();
		// create foos
		IntStream.range(1, 4).forEach(i -> foos.add(new Foo("Foo" + i)));
		// create bars
		foos.forEach(
				f -> IntStream.range(1, 4).forEach(i -> f.getBars().add(new Bar("Bar" + i + " <- " + f.getName()))));

		foos.stream().flatMap(f -> f.getBars().stream()).forEach(b -> System.out.println(b.getName()));

		System.out.println("Reduce");
		persons.stream().reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2).ifPresent(System.out::println);

	}

}
